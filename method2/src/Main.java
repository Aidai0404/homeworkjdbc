import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(word("Aidai"));
      //  san(new int[]{1,2,3,4},6);
       // san(new int[]{2,3,4,4},1);
        // String name = scanner.nextLine();
     //   myName("Aidai", 19);
        // myAge();
        // min(scanner.nextInt(), scanner.nextInt());
        //generation(1,10);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//                                      //true                : false
//        System.out.println(a > b ? a + " > " + b + " дан чон" : b + " > " + a +" дан чон");

//       int i = 0;
////       while (i<=10){
////           System.out.println("Hello world"+i);
////           i++;
////       }
//
//       do {
//           System.out.println("Hello");
//           i++;
//       }while(i<-1);

//        int [] array = {1,2,3,4,5,6,7,9};
//        int [] array2 = new int[]{1,2,3,4,467,23};
//        int [] array3 = new int[5];
//        array3[1] = 4;
//        System.out.println(array3[1]);
//  double a = Math.max(1,5);
        //    maks(new int[]{14,25,85,68,27,74,65,980});
 //       min(new int[]{1,2,5,2,24,75,62,98});

    System.out.println(massiv (10,36,67));
       System.out.println(massiv2(10, 36, 67));
}

    static int massiv(int a, int b, int c) {
        int[] array = new int[]{a, b, c};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) ;
        }
        System.out.println(" минимальный элемент :");
        return min;
    }
    static int massiv2(int a,int b, int c){
        int[] array1 = new int[]{a, b, c};
        int max= array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) ;
            max=array1[i];
        }
        System.out.println("Максимальный элемент: ");
        return max;
    }

    static void generation(int a, int b) {
        int[] massive = new int[5];
        for (int i = 0; i < massive.length; i++) {
            Random rm = new Random();
            massive[i] = rm.nextInt(a, b);
            System.out.println(massive[i]);
        }
    }

    static void myName(String name, int myAge) {
        System.out.println("Менин атым " + name);
        System.out.println("Менин жашым " + myAge);
    }

    static void myAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сиздин туулган жылыныз: ");
        int birthdayYear = sc.nextInt();
        System.out.println("менин жашым " + (2023 - birthdayYear));
    }

  /* static void min(int a, int b){
        if(a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }*/
static void san(int[]array, int a) {
    int index = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] == a) {
            index = i;
        }
        System.out.println(index);
    }
}
     static int word(String word){
         String [] words = {"Aidai","Dilnaz","Mederbaike","Dilnaz"};
         String word1 = words[0];
         int count = 0;
         for (int i = 0; i < words.length; i++) {
             if(words[i] == word) {
                 word1 = words[i];
                 count++;
             }
         }  System.out.println(word1+ " true");
         return count;
     }


    static void maks(int []array){
        int num1 =array[0];
        for (int i = 1; i < array.length; i++) {
            num1 = Math.max(num1,array[i]);
        }
        System.out.println("Maksimum : "+num1);
    }
    static void min(int []array) {
        int num2 = array[0];
        for (int i = 1; i < array.length; i++) {
            num2 = Math.min(num2, array[i]);
        }
        System.out.println("Min : " + num2);
}
}





