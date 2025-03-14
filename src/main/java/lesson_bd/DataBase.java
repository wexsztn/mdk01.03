package lesson_bd;
import java.sql.*;

    public class DataBase {
        private final String host = "localhost";
        private final String port = "5432";
        private final String dbName = "lesson2";
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

        public void createTableCategories(String table_name) throws ClassNotFoundException, SQLException {
            String sql = "CREATE TABLE IF NOT EXISTS " + table_name
                    + " (id INT PRIMARY KEY, category_id int, category_name VARCHAR(30));";

            try {
                Statement statement = getDbConnection().createStatement();
                statement.executeUpdate(sql);
                System.out.println("таблица создалась");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public void createTableCustomers(String table_name) throws ClassNotFoundException, SQLException {
            String sql = "CREATE TABLE IF NOT EXISTS " + table_name
                    + " (id INT PRIMARY KEY, customer_id int, customer_name VARCHAR(10), customer_familia VARCHAR(20), customer_number VARCHAR(12), customer_address VARCHAR(50));";
            try {
                Statement statement = getDbConnection().createStatement();
                statement.executeUpdate(sql);
                System.out.println("таблица создалась");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public void createTableOrders(String table_name) throws ClassNotFoundException, SQLException {
            String sql = "CREATE TABLE IF NOT EXISTS " + table_name
                    + " (id INT PRIMARY KEY, order_id int, order_date VARCHAR(15), order_status VARCHAR(30));";
            try {
                Statement statement = getDbConnection().createStatement();
                statement.executeUpdate(sql);
                System.out.println("таблица создалась");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public void createTableProduct(String table_name) throws ClassNotFoundException, SQLException {
            String sql = "CREATE TABLE IF NOT EXISTS " + table_name
                    + " (id INT PRIMARY KEY, product_id int, product_name VARCHAR(20), category_id int, price int);";
            try {
                Statement statement = getDbConnection().createStatement();
                statement.executeUpdate(sql);
                System.out.println("таблица создалась");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public void addValues(String table_name, String values) {
            try {
                Statement statement = getDbConnection().createStatement();
                statement.executeUpdate("INSERT INTO " + table_name + " VALUES(" + values + ");");
                System.out.println("добавлено");

            } catch (Exception e) {
                System.out.println("не удалось добавить");;
            }
        }

//    public void addCategory(String table_name, int id, int category_id, String category_name) {
//        try {
//            Statement statement = getDbConnection().createStatement();
//            int rows = statement.executeUpdate("INSERT INTO "
//                    + table_name + " VALUES (" + id  + ", " + category_id + ", " + category_name + ");");
//            System.out.printf("добавлено %d строк", rows);
//        } catch (Exception e) {
//            System.out.println("не удалось добавить");;
//        }
//    }
//
//    public void addCustomer(String table_name, int id, int customer_id, String customer_name, String customer_familia, String customer_number, String customer_address) {
//    try {
//        Statement statement = getDbConnection().createStatement();
//        int rows = statement.executeUpdate("INSERT INTO "
//                + table_name + "(id, customer_id, customer_name, customer_familia, customer_number, customer_address) " +
//                "VALUES (id, '1', 'Компьютер', 'Клавиатурный', '89012344489', 'ул.Боевая д.2');");
//        System.out.printf("добавлено %d строк", rows);
//    } catch (Exception e) {
//        System.out.println("не удалось добавить");;
//        }
//    }
//
//    public void addOrder(String table_name, int id, int order_id, String order_date, String order_status) {
//        try {
//            Statement statement = getDbConnection().createStatement();
//            int rows = statement.executeUpdate("INSERT INTO "
//                    + table_name + "(id, order_id, order_date, order_status) " +
//                    "VALUES (id, '1', '11.12.24', 'Прибыл в пункт выдачи');");
//            System.out.printf("добавлено %d строк", rows);
//        } catch (Exception e) {
//            System.out.println("не удалось добавить");;
//        }
//    }
//
//    public void addProduct(String table_name, int id, int product_id, String product_name, int category_id, int price) {
//        try {
//            Statement statement = getDbConnection().createStatement();
//            int rows = statement.executeUpdate("INSERT INTO "
//                    + table_name + "(id, product_id, product_name, category_id, price) " +
//                    "VALUES (id, '1', 'Мягкий медведь', '1','250');");
//            System.out.printf("добавлено %d строк", rows);
//        } catch (Exception e) {
//            System.out.println("не удалось добавить");;
//        }
//    }

        public void selectTableCategory(String table_name) throws  SQLException {
            Statement statement = getDbConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from " + table_name);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                int category_id = resultSet.getInt(2);
                String category_name = resultSet.getString(3);
                System.out.printf("%d. %s. %s. \n", id, category_id, category_name);
            }
        }

        public void selectTableCustomers(String table_name) throws  SQLException {
            Statement statement = getDbConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from " + table_name);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                int customer_id = resultSet.getInt(2);
                String customer_name = resultSet.getString(3);
                String customer_familia = resultSet.getString(4);
                String customer_number = resultSet.getString(5);
                String customer_address = resultSet.getString(6);
                System.out.printf("%d. %s. %s. %s. %s. %s. \n", id, customer_id, customer_name, customer_familia, customer_number, customer_address);
            }
        }
        public void selectTableOrders(String table_name) throws  SQLException {
            Statement statement = getDbConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from " + table_name);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                int order_id = resultSet.getInt(2);
                String order_date = resultSet.getString(3);
                String order_status = resultSet.getString(4);
                System.out.printf("%d. %s. %s. \n", id, order_id, order_date, order_status);
            }
        }
        public void selectTableProduct(String table_name) throws  SQLException {
            Statement statement = getDbConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from " + table_name);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                int product_id = resultSet.getInt(2);
                String product_name = resultSet.getString(3);
                int category_id = resultSet.getInt(4);
                int price = resultSet.getInt(5);
                System.out.printf("%d. %s. %s. \n", id, product_id, product_name, category_id, price);
            }
        }
    }

