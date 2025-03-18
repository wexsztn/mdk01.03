package film;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Database db = new Database();
        db.isConnection();
        Scanner sc = new Scanner(System.in);

        System.out.println("Добро пожаловать, дружище!!");
        while (true) {
            System.out.println("___________________________________");
            System.out.printf("Введите цифру, которая вам нужна: ");
            System.out.println("1. добавить фильм в список");
            System.out.println("2. удалить фильм из списка");
            System.out.println("3. поиск фильма");
            System.out.println("4. обновить/изменить фильм");
            System.out.println("5. список всех фильмов");
            System.out.println("6. выйти");

            int menu = sc.nextInt();
            if (menu == 1) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("__________________________");
                System.out.println("введите название фильма: ");
                String name = sc1.nextLine();
                System.out.println("введите директора: ");
                String director = sc1.nextLine();
                System.out.println("введите код: ");
                String code = sc1.nextLine();
                System.out.println("введите рейтинг: ");
                String rating = sc1.nextLine();
                db.addFilm(name, director, code, rating);
                System.out.println("фильм добавлен успешно!");

            } else if (menu == 2) {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("__________________________");
                System.out.printf("введите код фильма, который хотите удалить: ");
                int removeCode = sc2.nextInt();
                db.deleteFilm(removeCode);
                System.out.println("фильм был удален *грустный смайлик*");
            } else if (menu == 3) {
                System.out.printf("выберите критерий поиска:");
                System.out.println("1. название");
                System.out.println("2. код");

                int searchOption = sc.nextInt();
                String column = "";

                if (searchOption == 1) {
                    column = "name";
                } else if (searchOption == 2) {
                    column = "code";
                }

                Scanner sc2 = new Scanner(System.in);
                String value = sc2.nextLine();
                db.selectFilm(column, value);

            } else if (menu == 4) {
                System.out.printf("введите информацию, который хотите обновить: ");
                Scanner sc2 = new Scanner(System.in);
                int updateСode = sc2.nextInt();

                System.out.println("выберите критерий который хотите изменить:");
                System.out.println("1. название");
                System.out.println("2. директор");
                System.out.println("3. код");
                System.out.println("4. рейтинг");
                Scanner sc3 = new Scanner(System.in);
                String column = "none";

                int searchOption = sc3.nextInt();

                if (searchOption == 1) {
                    column = "name";
                } else if (searchOption == 2) {
                    column = "director";
                } else if (searchOption == 3) {
                    column = "code";
                } else if (searchOption == 4) {
                    column = "rating";
                }

                System.out.println("введите код фильма, который хотите обновить: ");
                Scanner sc4 = new Scanner(System.in);
                String value = sc4.nextLine();
                db.updateFilm(updateСode, column, value);
                System.out.println("фильм удален успешно!");

            } else if (menu == 5) {
                db.selectAllFilm();
            } else if (menu == 6) {
                break;
            } else {
                System.out.printf("неправильная команда!");
            }
        }
    }
}