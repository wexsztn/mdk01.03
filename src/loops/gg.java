package loops;

import java.util.Scanner;

public class gg {
    public static void main(String[] args) {
        //11.10
        int bb = (int) (Math.random()*100)+1;
        System.out.println("Выбери число");
        for (int i = 1; i <= 3; i++) {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if (number> bb)
            {
                System.out.println("Число меньше...");
            }
            else if( number < bb)
            {
                System.out.println("Число больше...");
            }
            else
            {
                System.out.println("Кажется, ты догадался");

            break;
            }
            if (i==3){
                System.out.println("Мое число это "+ bb);
            }

        }

    }
}
