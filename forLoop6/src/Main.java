import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          boolean isTrue = false;
        for (int a = 1; a <= 3; a++) {
            String b = scanner.nextLine();
            switch (b) {
                case "троллейбус":
                    System.out.println("Правильно");
                    isTrue = true;
                    break;
                case "я не знаю":
                    System.out.println("Правильный ответ троллейбус");
                    isTrue = true;
                    break;
                default:
                    System.out.println("Подумайте еще");
            }
            if (isTrue) {
                break;
            }

        }
    }
}