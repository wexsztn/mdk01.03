package lesson1;

import java.util.Scanner;

public class yy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца");
    int mounth = sc.nextInt();
    if (mounth == 12 || mounth == 1 || mounth == 2) {
            System.out.println("Зима");
        }
    else if( mounth == 3 || mounth ==4 || mounth== 5) {
            System.out.println("Весна");
        }
    if (mounth == 6 || mounth == 7 || mounth == 8) {
            System.out.println("Лето");
        }
    if (mounth == 9 || mounth == 10 || mounth == 11) {
            System.out.println("Осень");
        }





    }
}


