import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
//        int [] massive = new int[20];
//        for (int i = 0; i < massive.length; i++) {
//            int a = random.nextInt(170, 220);
////            System.out.println(a);
//            if(a>180 && a<190){
//                System.out.println(a);
//            }
//        }


//        int [] arr = new int[5];
//        int sum1 = 0;
//        int count1 = 0;
//        int count2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(0,5);
//          //  System.out.println(arr[i]);
//            int [] arr2 = new int[5];
//            int sum2 = 0;
//            for (int a = 0; a < arr2.length; a++) {
//                arr2[a] = random.nextInt(0,5);
//             //   System.out.println(arr2[a]);
//                 sum1+=arr[i];
//                 sum2+=arr2[a];
//                 count1 = sum1/ arr.length;
//                 count2 = sum2/ arr2.length;
//            }
////            System.out.println(count1);
////            System.out.println(count2);
//            if(count1>count2){
//
//                System.out.println("бул массивдин arr1 орточо арифметикалык саны " + count1 + " чон");
//                break;
//            }else {
//                System.out.println("бул массивдин arr2 орточо арифметикалык саны " + count2 + " чон");
//                break;
//            }
//        }

//        int sum = 0;
//        int[] massive = new int[]{1, -6, 7, -2, 10};
//        for (int i = 0; i < massive.length; i++) {
////            System.out.println(massive[i]);
//           if(massive[i]>0){
//               sum+= massive[i];
//           }
//        } System.out.println(sum);

//        Scanner scanner = new Scanner(System.in);
//        for (; true; ) {
//            System.out.println(" Какой этаж ? :");
//            int a = scanner.nextInt();
//
//            if (a == 0) {
//                break;
//            }
//            System.out.println(" Ваш  вес?");
//            int weight = scanner.nextInt();
//            if (a > 100) {
//                System.out.println(" Такого этажа нет !");
//                break;
//            }
//            if (weight < 200) {
//            } else if (weight < 70) {
//                System.out.println("Лифт может застрять между этажами!");
//                break;
//            } else {
//                System.out.println("Перевес ! ");
//                break;
//            }
//            for (int i = 0; a <= 100; i++) {
//                System.out.println("  Вы на " + a + " этажe:");
//                break;
//            }
        Scanner scan = new Scanner(System.in);
        int w = 100;
        int n = 1;
        int y = 0;
        // int relations = 3/1;
        Random rm = new Random();
        for (; true; ) {
            System.out.println("какой этаж?");
            int a = scan.nextInt();
            System.out.println("Какой вес?");
            int b = scan.nextInt();
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            if (a > 100) {
                System.out.println("нет этажей");
            } else {
                for (int i = 1; i < a; i++) {
                    count1+=3;
                    count2+=3;
                    count3+=1;
                    System.out.println("вы находитесь на #" + i + " этаже");
                    if (b >= 200 || a == 0) {
                        System.out.println("Лифт застрял между " + (a-1) + " и " + a + " этажами");
                        break;
                    }
                    if (count3==1){
                        System.out.println("лифт застрял между " + (a-1) + " и " + a + " этажами");
                    }
                }
            }

        }
    }
}