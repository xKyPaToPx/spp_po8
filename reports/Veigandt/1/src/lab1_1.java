import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел (N): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Количество чисел должно быть больше нуля.");
            return;
        }

        System.out.println("Введите последовательность " + n + " целых чисел:");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
       
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        int range = max - min;
        System.out.println("Размах последовательности: " + range);
        scanner.close();
    }
}
