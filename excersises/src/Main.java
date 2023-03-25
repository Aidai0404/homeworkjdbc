import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // varargs(new int[]{18, 19, 22}, "Aidai", "Dilnaz", "Dasha");
//        String word1 = " Aidai";
//        System.out.println(word1.charAt(2));
//        System.out.println(word1.substring(2));
//        System.out.println(word1.contains("i"));
//        System.out.println(word1.toUpperCase());
//        System.out.println(word1.toLowerCase());
//        System.out.println(word1.trim());
//        System.out.println(word1.equals("aidai"));
//        System.out.println(word1.replace("i","e"));
//        System.out.println(word1.length());
//        System.out.println(word1.concat("hello"));


        String word2 = "  I like Java!!!";
        System.out.println(word2.charAt(15));
        System.out.println(word2.endsWith("!!!"));
        System.out.println(word2.startsWith("I like"));
        System.out.println(word2.contains("Java"));
        System.out.println(word2.replace("a","o"));
        System.out.println(word2.toUpperCase());
        System.out.println(word2.toLowerCase());
        System.out.println(word2.length());
        String word3  = word2.substring(8,13);
        System.out.println(word3.toUpperCase());
        System.out.println(word2.trim());

    }

    static void varargs(int[] age, String ... names) {
            for (int i = 0; i < age.length; i++) {
                System.out.println(names[i] + " " + age[i] + "лет");
        }

        }

    }
