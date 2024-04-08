import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите символ:");
        char ch = scanner.next().charAt(0);

        System.out.println("Введите количество повторений:");
        int repeat = scanner.nextInt();

        String repeatedString = repeat(ch, repeat);
        System.out.println("Результат: " + repeatedString);
    }

    public static String repeat(char ch, int repeat) {
        if (repeat <= 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
