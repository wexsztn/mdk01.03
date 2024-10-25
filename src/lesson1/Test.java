package lesson1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        //27.09
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во баллов");
        int test = sc.nextInt();
        if (test > 100) {
            System.out.println("Неправильно");
        }
        else if (test > 80) {
            System.out.println("Отлично");
        }
        else if (test > 59) {
            System.out.println("Хорошо");
        }
        else if (test > 39) {
            System.out.println("Удовлетворительно");
        }
        else if (test >= 0) {
            System.out.println("Неудовлетворительно");
        }
        else
        {
            System.out.println("Неправильно");
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите");
        int status = 0;
        switch (status)
        {
            case 0:
                System.out.println("close app");
                break;
            case 1:
                System.out.println("jj");
                break;

        }

    }
}
