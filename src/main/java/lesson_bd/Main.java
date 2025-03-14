package lesson_bd;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        db.isConnection();

        db.createTableCategories("category");
        db.createTableCustomers("customers");
        db.createTableOrders("orders");
        db.createTableProduct("product");


//        db.addValues("category","1, 1,'Игрушки'");
//        db.addValues("category","2, 2, 'Одежда'");
//        db.addValues("category","3, 3, 'Одежда'");
//        db.addValues("category","4, 4, 'Книги'");
//        db.addValues("category","5, 5, 'Аксессуар'");
//        db.addValues("category","6, 6, 'Наклейки'");
//        db.addValues("category","7, 7, 'Уход за телом'");
//        db.addValues("category","8, 8, 'Аудиотехника'");
//        db.addValues("category","9, 9, 'Игрушки'");
//        db.addValues("category","10, 10, 'Носки'");
//        db.addValues("category","11, 11, 'Чехлы'");
//        db.addValues("category","12, 12, 'Уход за телом'");
//        db.addValues("category","13, 13, 'Тени'");
//        db.addValues("category","14, 14, 'Жевательная резинка'");
//        db.addValues("category","15, 15, 'Аксессуары для электроники'");
//        db.addValues("category","16, 16, 'Контуры для глаз'");
//        db.addValues("category","17, 17, 'Органайзеры'");
//        db.addValues("category","18, 18, 'Книги'");
//        db.addValues("category","19, 19, 'Малярные ленты'");
//        db.addValues("category","20, 20, 'Аудиотехника'");
//        db.addValues("category","21, 21, 'Маркеры'");
//        db.addValues("category","22, 22, 'Румяна'");
//        db.addValues("category","23, 23, 'Растительные масла'");
//        db.addValues("category","24, 24, 'Вода'");
//        db.addValues("category","25, 25, 'Мороженое'");
//        db.addValues("category","26, 26, 'Растворимый'");
//        db.addValues("category","27, 27, 'Специи'");
//        db.addValues("category","28, 28, 'Сахар'");
//        db.addValues("category","29, 29, 'Шоколад'");
//        db.addValues("category","30, 30, 'Брюки'");
//
////
//        db.addValues("customers","1, 1, 'Таня', 'Абрикосова', '79046009538', 'ул.Собачкина д.1'");
//        db.addValues("customers","2, 2, 'Арина', 'Шоколадная', '79046019539', 'ул. Собачкина д.1''");
//        db.addValues("customers","3, 3, 'Ангелина', 'Фруктова', '79046119538', 'ул.Цветочная д.16'");
//        db.addValues("customers","4, 4, 'Дима', 'Девяткин', '79046089541', 'ул.Соборная д.15'");
//        db.addValues("customers","5, 5, 'Ваня', 'Индексный', '79046909568', 'ул.Октябрьская д.143'");
//        db.addValues("customers","6, 6, 'Артем', 'Подзаборный', '79046089838', 'ул.Телефонная д.134'");
//        db.addValues("customers","7, 7, 'Полина', 'Пятерешная', '79046059135', 'ул.Кошкина д.14'");
//        db.addValues("customers","8, 8, 'Настя', 'Хосочная', '79056109537', 'ул.Алфавитная д.19'");
//        db.addValues("customers","9, 9, 'Тоня', 'Карпова', '79046209533', 'ул.Танкистов д.18'");
//        db.addValues("customers","10, 10, 'Кристина', 'Увалова', '79046001531', 'ул.Труда д.17'");
//        db.addValues("customers","11, 11, 'Ксюша', 'Росткова', '79046009768', 'ул.Ремезова д.16'");
//        db.addValues("customers","12, 12, 'Богдан', 'Анимешный', '79046879538', 'ул.Летчиков д.15'");
//        db.addValues("customers","13, 13, 'Кирилл', 'Машинный', '79046454535', 'ул.Понтонная д.14'");
//        db.addValues("customers","14, 14, 'Артемий', 'Хлопный', '79046349532', 'ул.Ижорская д.13'");
//        db.addValues("customers","15, 15, 'Вова', 'Дотный', '79046056658', 'ул.Девяткина д.12'");
//        db.addValues("customers","16, 16, 'Ваня', 'Небесный', '79046045438', 'ул.Ломоносова д.16'");
//        db.addValues("customers","17, 17, 'Диана', 'Твайсовна', '79045433530', 'ул.Пушкина д.11'");
//        db.addValues("customers","18, 18, 'Аня', 'Мармеладова', '79046006738', 'ул.Толстого д.12'");
//        db.addValues("customers","19, 19, 'Яна', 'Кабачкова', '79056899537', 'ул.Лермонтова д.11'");
//        db.addValues("customers","20, 20, 'Максим', 'Косточкин', '79046067539', 'ул.Трудящихся д.19'");
//        db.addValues("customers","21, 21, 'Женя', 'Медведев', '79044563434', 'ул.Текстовая д.17'");
//        db.addValues("customers","22, 22, 'Женя', 'Земленная', '79046235675', 'ул.Рубежное д.13'");
//        db.addValues("customers","23, 23, 'Илья', 'Майоров', '79046445538', 'ул.Твайсовная д.9'");
//        db.addValues("customers","24, 24, 'Артур', 'Целевой', '79024012337', 'ул.Карла Маркса д.18'");
//        db.addValues("customers","25, 25, 'Игорь', 'Бананный', '79046609377', 'ул.Майнкрафта д.16'");
//        db.addValues("customers","26, 26, 'Алла', 'Пугачева', '79046709555', 'ул.Болотная д.1'");
//        db.addValues("customers","27, 27, 'Филипп', 'Киркоров', '79046045539', 'ул.Озерная д.3'");
//        db.addValues("customers","28, 28, 'Егор', 'Крид', '79046009530', 'ул.Черная д.98'");
//        db.addValues("customers","29, 29, 'Рома', 'Своошный', '79046007731', 'ул.Белая д.76'");
//        db.addValues("customers","30, 30, 'Петя', 'Петухов', '79041239536', 'ул.Соболевая д.66'");
//
//
//        db.addValues("orders","1, 1, '12.11.23', 'Готов к выдаче'");
//        db.addValues("orders","2, 2, '12.09.24', 'В пути'");
//        db.addValues("orders","3, 3, '10.12.23', 'Получен'");
//        db.addValues("orders","4, 4, '17.10.24', 'Готов к выдаче'");
//        db.addValues("orders","5, 5, '14.11.23', 'В пути'");
//        db.addValues("orders","6, 6, '18.11.23', 'В пути'");
//        db.addValues("orders","7, 7, '26.04.22', 'Получен'");
//        db.addValues("orders","8, 8, '24.01.23', 'В пути'");
//        db.addValues("orders","9, 9, '27.03.22', 'Получен'");
//        db.addValues("orders","10, 10, '29.09.17', 'Получен'");
//        db.addValues("orders","11, 11, '30.09.24', 'Готов к выдаче'");
//        db.addValues("orders","12, 12, '09.05.19', 'Получен'");
//        db.addValues("orders","13, 13, '08.04.24', 'Готов к выдаче'");
//        db.addValues("orders","14, 14, '24.06.23', 'В пути'");
//        db.addValues("orders","15, 15, '21.02.22', 'Получен'");
//        db.addValues("orders","16, 16, '26.07.20', 'Получен'");
//        db.addValues("orders","17, 17, '08.02.24', 'Готов к выдаче'");
//        db.addValues("orders","18, 18, '05.01.24', 'Готов к выдаче'");
//        db.addValues("orders","19, 19, '11.06.23', 'В пути'");
//        db.addValues("orders","20, 20, '09.11.22', 'Получен'");
//        db.addValues("orders","21, 21, '07.08.21', 'Получен'");
//        db.addValues("orders","22, 22, '01.11.23', 'В пути'");
//        db.addValues("orders","23, 23, '28.02.21', 'Получен'");
//        db.addValues("orders","24, 24, '31.09.23', 'В пути'");
//        db.addValues("orders","25, 25, '29.10.24', 'Готов к выдаче'");
//        db.addValues("orders","26, 26, '22.12.22', 'Получен'");
//        db.addValues("orders","27, 27, '19.11.23', 'В пути'");
//        db.addValues("orders","28, 28, '15.08.21', 'Получен'");
//        db.addValues("orders","29, 29, '10.07.24', 'В пути'");
//        db.addValues("orders","30, 30, '12.10.24', 'Готов к выдаче'");
//
//
//        db.addValues("product","1, 1, 'Плюшевый медведь', 1, 150");
//        db.addValues("product","2, 2, 'Футболка', 2, 300");
//        db.addValues("product","3, 3, 'Пальто', 2, 2499");
//        db.addValues("product","4, 4, 'Альбом TWICE', 3, 5020");
//        db.addValues("product","5, 5, 'Брелок', 4, 200");
//        db.addValues("product","6, 6, 'Набор наклеек', 5, 134");
//        db.addValues("product","7, 7, 'Скраб для тела', 7, 279");
//        db.addValues("product","8, 8, 'Наушники', 8, 1194");
//        db.addValues("product","9, 9, 'Игрушка пингвин', 9, 368");
//        db.addValues("product","10, 10, 'Носки овечья', 10, 397");
//        db.addValues("product","11, 11, 'Чехол для Realme 6', 11, 376");
//        db.addValues("product","12, 12, 'Гель для душа', 12, 173");
//        db.addValues("product","13, 13, 'Тени для век', 13, 158");
//        db.addValues("product","14, 14, 'Жевательная резинка', 14, 104");
//        db.addValues("product","15, 15, 'Power Bank', 15, 1179");
//        db.addValues("product","16, 16, 'Карандаш для глаз', 16, 82");
//        db.addValues("product","17, 17, 'Органайзер', 17, 614");
//        db.addValues("product","18, 18, 'Записная книжка', 18, 83");
//        db.addValues("product","19, 19, 'Клейкая лента', 19, 125");
//        db.addValues("product","20, 20, 'Колонка', 20, 1290");
//        db.addValues("product","21, 21, 'Текстовыделители', 21, 260");
//        db.addValues("product","22, 22, 'Румяна', 22, 159");
//        db.addValues("product","23, 23, 'Масло подсолнечное', 23, 137");
//        db.addValues("product","24, 24, 'Вода питьевая', 24, 439");
//        db.addValues("product","25, 25, 'Пломбир', 25, 74");
//        db.addValues("product","26, 26, 'Кофе', 26, 304");
//        db.addValues("product","27, 27, 'Лавровый лист', 27, 271");
//        db.addValues("product","28, 28, 'Сахар белый', 28, 77");
//        db.addValues("product","29, 29, 'Шоколад', 29, 64");
//        db.addValues("product","30, 30, 'Брюки', 30, 2947");
//
//
        db.selectTableCategory("category");
        db.selectTableCustomers("customers");
        db.selectTableOrders("orders");
        db.selectTableProduct("product");
    }
}