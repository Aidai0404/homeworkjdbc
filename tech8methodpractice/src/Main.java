import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     aidai(7,60);

    }
    static void aidai( int a,int b){
        Random rm = new Random();

        int [] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = rm.nextInt(a,b);
        }
        System.out.println(Arrays.toString(array));


        }


        






    }
