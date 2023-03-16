import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*    int a = 10;
        int b = 5;
        int c = Math.max(b,a);
        int d = Math.min(a,b);
        System.out.println(c);
        System.out.println(Math.min(a,b));**/

        Scanner sc = new Scanner(System.in);
      /*  int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.min(a,b));*/

    /*    int a1 = 7;//7
        a1++;// a1 = 7-1= 6 (a1=6)
        a1*=5;//  6*5=30  a1 = a1 * 5 a1=30;
        a1/=3;//  a1 = a1/3 30/3=10
        a1=a1-1; // a1 = 10 - 1 = 9
        System.out.println(a1);**/

        //++a prefix --a
        //a++ postfix a--;

       /* Random rm = new Random();
        int a = rm.nextInt(20,30);
        System.out.println(a);**/
     /*   int a = 100; //100/9 =
        a%=10;
        System.out.println(a);**/

     //   String a = sc.nextLine();
      //  System.out.println("Меня зовут " + a);
      //  int b = sc.nextInt();
     //   System.out.println("I am " + b + " years old");

//        int a = 5;
//        System.out.println((double) a);

      /* int a = 8;
      int b = 10;
      int c = Math.max(a,b);
      int d = Math.min(a,b);
       double pow = Math.pow(c,2);
       double min = pow - b;
        System.out.println((int) min%2); // 45.0**/


        int myAge = sc.nextInt();
        Random rm = new Random();
        int notMyAge = rm.nextInt(10,60);
        String myAge1 = "Менин жашым " + myAge;
        System.out.println(myAge1);
        System.out.println("Менин жашым эмес " + notMyAge);


    }

}
