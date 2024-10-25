package massiv;

import java.util.Arrays;

public class uou {
    public static void main(String[] args) {
        //11.10
    //int [] array1 = new int [5];
    //array1 [3] = 11;
       // System.out.println(Arrays.toString(array1));

        //15.10
        int[] array1 = new int[7];
       for (int i =0;i<array1.length;i++) {
           array1[i] = (int) (Math.random()*130)+20;
        }
        System.out.println(Arrays.toString(array1));


        int max = 0;
        for (int i = 0 ; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println(max);

        int min = 0;
        for (int i = 0 ; i < array1.length; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        System.out.println(min);
    }
}
