package massiv;

import java.util.Arrays;
import java.util.Scanner;

public class tyty {
    public static void main(String[] args) {
        //18.10
        int[] array1 = new int[10];
        for (int i =0;i<array1.length;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number from 1 to 100: ");
            int userNumber = sc.nextInt();
            if (userNumber == 0) {
                System.out.println("exit");
                break;
            }
            else if (userNumber > 99 || userNumber < 0) {
                System.out.println("Try again!");
                i--;
            } else {
                array1[i] = userNumber;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
