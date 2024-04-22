import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Использование: java Main <символ> <количество повторений>");
            return;
        }

        char ch = args[0].charAt(0);
        int repeat = Integer.parseInt(args[1]);

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
