import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //      Scanner scanner= new Scanner(System.in);
//  умножение, деление, вычитание, сложение
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println((double) a/b);
//        System.out.println(a*b);
//        System.out.println(a+b);
//        System.out.println(a-b);


//площадь и периметр круга
      /*  double p = 3.14;
        int R = scanner.nextInt();
        int q = R*R;
        double S = p*q;
        double P = 2*p*R;
        System.out.println(S);
        System.out.println(P);**/

//площадь и периметр прямоугольника
     /*   int a = scanner.nextInt();
        int b = scanner.nextInt();
        double P = (a+b)*2;
        double S = a*b;

        System.out.println(P + "\n" +S);**/

// напишите джава код, который меняет местами значения переменных
   /* int a = 2;
    int b = 3;
    int change;
    change = a;
    a = b;
    b = change;

        System.out.println(a);
        System.out.println(b);

       int add = a = a + b;
       int minus1 = b = a - b;

        System.out.println(add);
        System.out.println(minus1);**/


        // Напишите жава код который берет через консоль целое число и конвертирует на бинарное число.
     /*   int a = scanner.nextInt();
        double b = a;
        System.out.println(b);
        // or you can

        int c = scanner.nextInt();
        System.out.println((double) c);**/

        //Напишите жава код который берет через консоль бинарное число и конвертирует на целое число.

     /*   double a = scanner.nextDouble();
        System.out.println((int) a);**/

//Катаны ушул кодтон туураланыз
   /*     int x = 0;
        System.out.println("x is " + x);

        double z = 15.2;   // set x to 15.2
        System.out.println("x is now " + z);

        double y;   // set y to 1 more than x
        y =  z + 1;
        System.out.println("x and y are " + z + " and " + y);**/

//Напишите жава код который попросит у вас ввести ваше имя и год рождения. И выведет на консоль ваше имя и возраст.

   /*     System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("In what year were you born?");
        int year = scanner.nextInt();

        int age = 2023-year;
        System.out.println(name + " is " + age);**/

        //100 - 200го чейин 3 сан алып консольго суммасын чыгарыныз.

       /* Random rm = new Random();
        for (int i = 0; i < 3; i++) {
            System.out.println(rm.nextInt(100,200));
        }**/

        //Напишите жава код который возмет через консоль число и проверит
        //если число четное то выведит на консоль 1 если не четное то 0.
     /*   int a = scanner.nextInt();
        if(a%2 == 0){
            System.out.println(a);
        } else {
            System.out.println(0);
        }**/

//Напишите жава код, который возмет через консоль число и проверит,
// если число отрицательное то выведит на консоль negative, если положительное то напечатает positive.
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        String c = scanner.next();
//        switch (c) {
//            case "*":
//                System.out.println(a * b);
//                break;
//            case "/":
//                    System.out.println(a / b);
//                    break;
//            case "-" :
//                System.out.println(a-b);
//                break;
//            case "+":
//                System.out.println(a+b);
//
//            default:
//                System.out.println("Такой символ " + c + " не разрешается");
//        }

//Напишите жава код, который возмет через консоль число и проверит,
// если число отрицательное то выведит на консоль negative, если положительное то напечатает positive.
        /*      int a = scanner.nextInt();

        if(a<0){
            System.out.println("negative");
        }else{
            System.out.println("positive");
        }**/


//     int a = 0;
//     int b = 100;
//     while (a<100-2){
//         a+=7;
//         System.out.println(a);
//     }
//
//        long a = scanner.nextLong();
//        if(a<1000000){
//            System.out.println("it is incorrect");
//        }else{
//            System.out.println("it is correct");
//        }
//

        //Next, user must enter one number from 0 to 9. If an incorrect number was entered,
        // then you need to display a message that an incorrect value was entered and close the program.
//        int a = scanner.nextInt();
//          if(a<0 && a>9){
//              System.out.println("it is incorrect");
//          }
//          else{
//              System.out.println("correct");
//          }

        //Next, you need to count how many times the second number occurs in the first number.

     /*   Random rm = new Random();
        int first = rm.nextInt(10);
        int second = rm.nextInt(200);
        int count=0;
        if((second%10)==first){
            count++;
        }
        if(Math.round((second/10))==first){
            count++;
        }
        System.out.println(first+" occurs "+count+" times in "+second);**/

        //Next, you need to display the answer on the screen. The output format is free.
       /* System.out.printf("Привет - %s! Как дела %s?", "Саша", "на работе");
        System.out.printf("\nМне - %d",18);**/


    /*    for (int i = 0; i < 3; i++) {
            long a = scanner.nextLong();
            if(a>100){
                a/=10;
                System.out.println(a);
            }
        }**/

        Scanner scanner1 = new Scanner(System.in);
      /*  int ticketLength = scanner1.nextInt();
        Random rm = new Random();
        int happyTicket = rm.nextInt(0,ticketLength);
        int simpleTicket = rm.nextInt(0,ticketLength);
        System.out.println(happyTicket);
        System.out.println(simpleTicket);
        boolean isHappy = false;
        for (int i = 0; i <= ticketLength; i++) {
            if (i == happyTicket){
                isHappy = true;
            }else{
                isHappy = false;
            }
            // isHappy = (i == happyTicket);
        }
        if (isHappy){
            System.out.println("У вас счастливый билет: " + happyTicket);
        }else{
            System.out.println("У вас простой билет: " + simpleTicket);
        }**/

        //       int a = scanner1.nextInt();
        //     String tag = "#";
//        while(b<=a) {
//            b++;
//            if (b == a) {
//                System.out.println("@");
//                System.out.println( tag + "\n" + "\t");
//            }
//        }

//        int c = 0;
//        System.out.print("@");
//        while (c<=a){
//            c++;
//            System.out.println(" " + tag);
//        }
//        int san = scanner1.nextInt();
//        int i = scanner1.nextInt();
//        while (san < i) {
//            san++;
//            if (san % 2 != 0) {
//                System.out.println(san);
//            }
//        }

//      int [] nums = new int[]{1,2,3,4,5};
//        sum(nums,3);
//    }
//    public static void sum(int[]num, int target){
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num.length; j++) {
//                int sum1 = num[i] + num[j];
//                if(sum1 == target) {
//                    System.out.println(num[i] + "+" + num[j] + "=" + target);
//                    System.out.println("[" + num[i] + "," + num[j] + "]");
//
//                }
//            }
//        }
//        int a = scanner1.nextInt();
//        int b = scanner1.nextInt();
//        int sum = 0;
//        for (int i = a; i < b; i++) {
//            if(i%2!=0){
//                sum+=i;
//                System.out.println(sum);
//            }
//        }


//        for (int i = 0; i < 10; i++) {
//            double result = Math.pow(2,i);
//            System.out.println(result);
//        }


//        int count = 0;
//        int sum = 0;
//            for (int i = 0; i<10; i++) {
//                int a = scanner1.nextInt();
//                if (a == 0) {
//                 break;
//                }else{
//                    count++;
//                    sum+=a;
//                }
//            }
//            System.out.println(sum);
//            System.out.println(sum /(double) count);

        }
    }



