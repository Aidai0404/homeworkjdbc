import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**   Random random=new Random();
         int [] array=new int[20];
         int sum=0;
         int sum2=0;
         int count=0;
         int count2=0;
         for (int i = 0; i < array.length; i++) {
         array[i]= random.nextInt(100);
         System.out.println(array[i]);
         }

         for (int i = 0; i < array.length; i++) {
         if (array[i]>50){
         sum+=array[i];
         count++;
         }else {
         sum2+=array[i];
         count2++;
         }

         }
         System.out.println((double) sum/count);
         System.out.println((double) sum2/count2);*/

//     Random rm=new Random();
//     int array[]=new int[20];
//     int sum=0;
//     int sum2=0;
//     int count=0;
//     int count2=0;
//        for (int i = 0; i < array.length; i++) {
//            array[i]=rm.nextInt(100);
//            System.out.println(array[i]);
//        }
//        for (int i = 0; i < array.length; i++) {
//            if(array[i]>50){
//                sum+=array[i];
//                count++;
//            }else{
//                sum2+=array[i];
//                count2++;
//            }
//
//        }
//        System.out.println((double) sum/count);
//        System.out.println((double) sum2/count2);
//
//

//     aidai(new int[10], 0, 0, 0, 0);
//
//    }
//
//    static void aidai(int[] array, int sum, int sum2, int count, int count2) {
//        Random rm = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rm.nextInt(50);
//            System.out.println(array[i]);
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 30) {
//                sum += array[i];
//                count++;
//            } else {
//                sum2 += array[i];
//                count2++;
//
//            }
//
//        }
//        System.out.println((double) sum/count);
//        System.out.println((double) sum2/count2);

//        method(" pizza"," hamburger"," potatoes-free"," cheese pasta");
//
//    }
//    static void method(String...a){
//        for(String str: a){
//            System.out.println("My favorite meals are"+str);
//
//        }

//        String a = "My favorite foods are:";
//        String b=" pizza, potatoes-free, hamburger, cheese-pasta";
//        System.out.println(a+b);

        Scanner sc = new Scanner(System.in);
//        System.out.println("What are your three favorite foods?");
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//        String c = sc.nextLine();
//        System.out.println("Oh great!!!");
        String h=sc.nextLine();

        switch (h){
            case "pizza":
                int costofpizza=500;
                System.out.println("It costs "+costofpizza);
                break;
            case "hamburger":
                int costofham=250;
                System.out.println("It costs "+costofham);
                break;
            case"cheesecake":
                int costofcheese=150;
                System.out.println("It casts "+costofcheese);
                break;
            default:
                System.out.println("Sorry, we don't have this product in our menu");
            }

        }
//        Scanner sc=new Scanner(System.in);
//        System.out.println("What is ur favorite food?");
//        String a = sc.nextLine();
//        switch (a){
//            case "pizza":
//                System.out.println("oh,i like pizza too!!!");
//                break;
//            case "hamburger":
//                System.out.println("I do love hamburger,but pizza - more(");
//                break;
//            default:
//                System.out.println("I only like pizza,that's all");


//        for (int i = 1; i <=10 ; i++) {
//            for (int j = 1; j <=10; j++) {
//                int result=j*i;
//                System.out.print(i+"*"+j+"="+result+" ");
//
//
//            }System.out.println();

//        int [] array =new int [10];
//        Random rm = new Random();
//        int min = array.length;
//        int b=0;
//        for (int i = 0; i < array.length; i++) {
//            array[i]=rm.nextInt(5,20);
//            min=Math.min(array[i],min);
//            b=Math.max(array[i],b);
//        }  System.out.println(min);
//        System.out.println(b);


//        int [] array=new int[10];
//        Random rm=new Random();
//        int min = array.length;
//        int a=0;
//        for (int i = 0; i < array.length; i++) {
//            array[i]=rm.nextInt(5,30);
//            min=Math.min(array[i],min);
//            a=Math.max(array[i],a);
//
//        }
//        System.out.println(min);
//        System.out.println(a);

//        int[] array=new int[10];
//        Random rm=new Random();
//        int min=array.length;
//        int max=0;
//        int sum=0;
//        int count=0;
//        for (int i = 0; i < array.length; i++) {
//            array[i]=rm.nextInt(30);
//            sum+=array[i];
//            count++;
//            min=Math.min(array[i],min);
//            max=Math.max(array[i],max);
//
//        }
//        System.out.println(min);
//        System.out.println(max);
//        System.out.println((double) sum/count);
//
//
//        int[] array=new int[10];
//        Random rm=new Random();
//        int min =array.length;
//        int max=0;
//        int sum=0;
//        int count=0;
//        for (int i = 0; i < array.length; i++) {
//            array[i]=rm.nextInt(50);
//            sum+=array[i];
//            count++;
//            max=Math.max(array[i],max);
//            min=Math.min(array[i],min);
//        }
//        System.out.println((double) sum/count);
//        System.out.println(max);
//        System.out.println(min);
//
//         int [] array=new int[10];
//         Random rm=new Random();
//         int max=0;
//         int min=array.length;
//         int sum=0;
//         int count=0;
//        for (int i = 0; i < array.length; i++) {
//           array[i]=rm.nextInt(40);
//           sum+=array[i];
//           count++;
//           max=Math.max(array[i],max);
//           min=Math.min(array[i],min);
//        }
//        System.out.println((double) sum/count);
//        System.out.println(max);
//        System.out.println(min);
    }








