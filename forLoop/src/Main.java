import javax.security.sasl.SaslClient;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 60; i > 5; i-=5) {
//            System.out.println(i+" ");
//        }
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        System.out.println("случайное число:"+i);
//        int w=1;
//        for (int s=1;s<=i;s++){
//            w *=s;
//        }
//        System.out.println("факториал случайного числа:"+i+"!="+w);

        Random random = new Random();
//        int [] massive = new int[20];
//        for (int i = 0; i < massive.length; i++) {
//            int a = random.nextInt(170, 220);
////            System.out.println(a);
//            if(a>180 && a<190){
//                System.out.println(a);
//            }
//        }
         int [] arr = new int[]{};
        for (int i = 0; i < arr.length; i++) {
            int arr1 = random.nextInt(0,5);
            System.out.println(arr1);
        }

    }
}