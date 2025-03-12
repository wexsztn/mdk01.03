package film;
import java.sql.*;

public class Database {
    private final String host = "localhost";
    private final String port = "5432";
    private final String dbName = "film_lesson";
    private final String login = "postgres";
    private final String password = "";

   private Connection dbCon;

    private Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String str = "jdbc:postgresql://" + host + ":" + port + "/" + dbName;
        Class.forName("org.postgresql.Driver");
        dbCon = DriverManager.getConnection(str, login, password);
        return dbCon;
    }

    public void isConnection() throws SQLException, ClassNotFoundException {
        dbCon = getDbConnection();
        System.out.println(dbCon.isValid(1000));
    }

    public void createTableFilm(String film) throws ClassNotFoundException, SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS film (id INT PRIMARY KEY, name VARCHAR(30), director VARCHAR(30), code int, rating int);";
        PreparedStatement statement = getDbConnection().prepareStatement(sql);
        statement.executeUpdate();
    }

    public void addFilm(String film, int id, String name, String director, int code, int rating) throws ClassNotFoundException, SQLException {
      String sql = "INSERT INTO film VALUES (" + id  + ", " + name + ", " + director + ", " + code + ", " + rating + ");";
           PreparedStatement statement = getDbConnection().prepareStatement(sql);
           statement.executeUpdate();
    }

    public void deleteFilm(int code) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM film WHERE code='" + code + "';";
        PreparedStatement statement = getDbConnection().prepareStatement(sql);
        statement.executeUpdate();
    }

    public void updateFilm(int update_code, String column, String value) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE film SET " + column + " = '" + value + "' WHERE code='" + update_code + "';";
        PreparedStatement statement = getDbConnection().prepareStatement(sql);
        statement.executeUpdate();
    }

    public void selectFilm(String column, String value) throws ClassNotFoundException, SQLException {
        Statement statement = getDbConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM film WHERE " + column + "='" + value + "';");
        while (resultSet.next()) {
            String line1 = resultSet.getString(1);
            String line2 = resultSet.getString(2);
            String line3 = resultSet.getString(3);
            String line4 = resultSet.getString(4);
            System.out.println(line1 + " " + line2 + " " + line3 + " " + line4);
        }
    }

    public void selectAllFilm() throws ClassNotFoundException, SQLException {
        Statement statement = getDbConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM film;");
        while (resultSet.next()) {
            String line1 = resultSet.getString(1);
            String line2 = resultSet.getString(2);
            String line3 = resultSet.getString(3);
            String line4 = resultSet.getString(4);
            System.out.println(line1 + " " + line2 + " " + line3 + " " + line4);
        }
    }

}
