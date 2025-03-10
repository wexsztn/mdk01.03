package film;

import java.sql.*;

public class Database {
    private final String host = "localhost";
    private final String port = "5432";
    private final String dbName = "film_lesson";
    private final String login = "postgres";
    private final String password = "";

   private Connection dbCon;

    private Connection getDbConnection() {
        String str = "jdbc:postgresql://" + host + ":"
                + port + "/" + dbName;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Соединение установлено");
        } catch (ClassNotFoundException e) {
            System.out.println("соединение не установлено");
        }
        try {
            dbCon = DriverManager.getConnection(str, login, password);
        } catch (SQLException e) {
            System.out.println("неверный путь (логин и пароль)");
        }
        return dbCon;
    }

    public void isConnection() throws SQLException, ClassNotFoundException {
        dbCon = getDbConnection();
        System.out.println(dbCon.isValid(1000));
    }

    public void createTableFilm(String table_name) throws ClassNotFoundException, SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS " + table_name
                + " (id INT PRIMARY KEY, name VARCHAR(30), director VARCHAR(30), code int, rating int);";

        try {
            Statement statement = getDbConnection().createStatement();
            statement.executeUpdate(sql);
            System.out.println("таблица создалась");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addFilm(String table_name, int id, String name, String director, int code, int rating) {
       try {
           Statement statement = getDbConnection().createStatement();
           int rows = statement.executeUpdate("INSERT INTO "
                   + table_name + " VALUES (" + id  + ", " + name + ", " + director + ", " + code + ", " + rating +");");
           System.out.printf("добавлено %d строк", rows);
        } catch (Exception e) {
           System.out.println("не удалось добавить");;
        }
    }

    public void selectTableFilm(String table_name) throws  SQLException {
        Statement statement = getDbConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from " + table_name);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String director = resultSet.getString(3);
            int code = resultSet.getInt(4);
            int rating = resultSet.getInt(5);
            System.out.printf("%d. %s. %s. \n", id, name, director, code, rating);
        }
    }
}
