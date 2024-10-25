package lesson1;

public class FirstClass {
    public static void main(String[] args) {
        // переменные
        int a, FixPrice;
        a=4;
        FixPrice=8;
        System.out.println(a+FixPrice);
        System.out.println(a*FixPrice);
        System.out.println(a-FixPrice);
        System.out.println(a/FixPrice);
        // 20.09
        System.out.println(a>FixPrice);
        System.out.println(a>=FixPrice);
        System.out.println(a==FixPrice);
        System.out.println(a!=FixPrice);
        String abs="231 группа";
        System.out.println(abs);

        int fareng=32;
        double celsi;
        celsi=(fareng-32)/1.8;
        System.out.println(celsi);
        //24.09
       int status = 1;
        if (status== 0) {
            System.out.println("Программа закрывается");
        }
        if (status == 1) {
            System.out.println("Программа работает");
        }




    }
}

