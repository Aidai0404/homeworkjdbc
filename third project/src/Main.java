import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* int a = 0;
        while (a < 10) {
            System.out.println("Hello");
            a+= 5;*/

           /* int a = 0;
            while(a<10) {
                System.out.println("Hello");
                a+=2;
        }*/

       /* int b = 2;
        b+=5;
        System.out.println(b);*/

      /*  int c = 6;
        c++;
        System.out.println(c);*/

       /* double q = 3.5;
        System.out.println(q-Math.floor(q));
        System.out.println(Math.round(q)-q);*/

      /*double b = 4.5;
        System.out.println(b-Math.floor(b));
        System.out.println(Math.round(b)-b);*/

        /*int a1 = 4, b = 6;
        while (a1 < b) {
            a1 = a1 + 1;
            System.out.println();
        }*/


        Scanner sc = new Scanner(System.in);
      /*  int a = sc.nextInt();
        int schetchik = 0;
        while (0 < a) {
            a /= 10;
            schetchik++;*/

           /* int b = sc.nextInt();
            int count = 0;
            while(0<b){
                b/=10;
                count++;
            } System.out.println("sizdin san "+count+"oruunduu");*/

        /*int a = 0;
        int b = 10;
        while (b > a) {
            System.out.println("Java");
            b--;*/

//        int a = 0;
//        int b = 20;
//        while(b>a){
//            System.out.println("Aidai");
//            b--;

//        int a=4;
//        int a2=6;
//        while(a<a2){
//            System.out.println("Java");
//            a=a+a2;

      /*  int a = sc.nextInt();
        int b = sc.nextInt();


        while (a<b){
            a++;
            System.out.println(Math.pow(b,2));*/

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        while(a>b){
//            b++;
//            System.out.println(Math.pow(a,2));
//        }

//        int a = 1;
//        int b = sc.nextInt();
//        while (a < b) {
//            if (a % 2 == 0) {
//                System.out.println(a);
//            } a++;
//        }

        System.out.println("Автобуска окшош бирок электро энергия менен журот");
        System.out.println("бул эмне?");
        boolean joop = false;
        for (int i= 0;true; i++) {
            if(joop=true){
                break;
            }
            String a = sc.nextLine();
            switch (a) {
                case "Троллейбус":
                    System.out.println("Туура азаматсын");
                    joop=true;
                    break;

                case "Автобус":
                    System.out.println("Туура эмес");
                    break;

                case "билбейм":
                    System.out.println("Туура жооп - троллейбус");
                    joop=true;
                default:
                    System.out.println("дагы ойлонуп коюнуз");


    }
}



