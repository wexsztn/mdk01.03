package loops;

import java.util.Scanner;

public class noName {
    public static void main(String[] args) {
        //08.10
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время");
        int vrema = sc.nextInt();
        if(vrema == 23) {
            System.out.println("Добрый вечер!");
        }
        else if (vrema >=18)
        {
            System.out.println("Добрый вечер!");
        }
        else if (vrema >= 12)
        {
            System.out.println("Добрый день!");
        }
        else if (vrema >=4)
        {
            System.out.println("Доброе утро!");
        }
        else if (vrema >=0)
        {
            System.out.println("Доброй ночи!");
        }
        else if (vrema <0)
        {
            System.out.println("Неправильное время, повторите попытку");
        }
        else if (vrema>23)
        {
            System.out.println("Неправильное время, повторите попытку");
        }

    }
}