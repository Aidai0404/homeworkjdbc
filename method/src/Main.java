import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //   int year = sc.nextInt();
        //   yourAge(year);
        //  int a = sc.nextInt();
        //   int b = sc.nextInt();
        // minMaxsan(a,b);
        //   orto5(a,b);
        //   maxSan(a, b);
        int[] massive = {1, 2, 3, 4, 5, 6};
        maxMassive(massive);
    }

    static void yourAge(int year) {
        System.out.println(2022 - year);
    }

    static void minMaxsan(int a, int b) {
        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    static void orto5(int a, int b) {
        int[] massive = new int[5];
        Random rm = new Random();
        for (int i = 0; i < massive.length; i++) {
            massive[i] = rm.nextInt(a, b);
            System.out.println(massive[i]);
        }
    }

    static void maxSan(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println(max);
    }

    static void maxMassive(int[] massive) {
        int max = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (max < massive[i]) {
                max = massive[i];
            }
        }  System.out.println(max);
    }
}