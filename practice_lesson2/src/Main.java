import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("   J     a    v         v    a");
        System.out.println("   J    a a    v       v    a a");
        System.out.println("J  J   aaaaa     V   V     aaaaa");
        System.out.println(" JJ   a     a      V      a     a");

        System.out.println(" +'''''+");
        System.out.println("[| 0 0 |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");


        System.out.println(50 + 40 / 2 * 3 - 20);

        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int summa = a+b+c;
//        int koboitu = a*b*c;
//        double ortochoSan = summa;
//
//        System.out.println(a+"+"+b+"+"+c+"="+summa);
//        System.out.println(a+"*"+b+"*"+c+"="+koboitu);
//        System.out.println("("+a+"+"+b+"+"+c+")"+"/3="+ortochoSan/3);
    /*    System.out.println("number1");
        int number1 = scanner.nextInt();
        System.out.println("number2");
        int number2 = scanner.nextInt();
        System.out.println("number3");
        int number3 = scanner.nextInt();
        int summa = number1 + number2 + number3;
        int koboituu = number1 * number2 * number3;
        double d = 3.0;
        System.out.printf("%d + %d + %d = %d", number1, number2, number3, summa);
        System.out.println();
        System.out.println(number1 + "*" + number2 + "*" + number3 + "=" + koboituu);
        System.out.printf("(%d + %d + %d) /3 = %f", number1, number2, number3, summa / d);**/

        int sat=1;
        int min=1;
        int sekun=1;

        int sum= sat*60*60;
        int sun= min*60;
        int sub = sum+sun+sekun;

        System.out.println(sub);
    }
}