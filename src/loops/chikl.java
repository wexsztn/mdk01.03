package loops;

public class chikl {

    public static void main(String[] args) {
        // 07.10
        // int i = 1;
        // System.out.println(++i); //1
        // System.out.println(i); //2
        int i = 1;
        while(i<=9) {
            System.out.println("этаж ,"+i);
            i++;
        }
        for(int j =1;j<= 9;j++){
            System.out.println("Этаж "+j);
        }
        
        for(int k=1;k<=100;k++) {
            if(k%2 ==0) {
                continue;
            }
            if(k == 25){
                break;
            }
            System.out.println(k);
        }
    }

}


