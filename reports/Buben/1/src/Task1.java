import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину последовательности:");
        int length = scanner.nextInt();

        int[] sequence = new int[length];
        System.out.println("Введите элементы последовательности:");
        for (int i = 0; i < length; i++) {
            sequence[i] = scanner.nextInt();
        }

        int min = findMin(sequence);
        int max = findMax(sequence);
        int sum = calculateSum(sequence);
        int product = calculateProduct(sequence);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Произведение элементов: " + product);

        scanner.close();
    }

    public static int findMin(int[] sequence) {
        int min = sequence[0];
        for (int num : sequence) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] sequence) {
        int max = sequence[0];
        for (int num : sequence) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int calculateSum(int[] sequence) {
        int sum = 0;
        for (int num : sequence) {
            sum += num;
        }
        return sum;
    }

    public static int calculateProduct(int[] sequence) {
        int product = 1;
        for (int num : sequence) {
            product *= num;
        }
        return product;
    }
}