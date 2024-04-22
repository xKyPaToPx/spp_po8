import java.util.Arrays;
import java.util.Scanner;

public class MedianCalculator {

    public static double findMedian(int[] numbers) {
        Arrays.sort(numbers);

        int length = numbers.length;


        if (length % 2 != 0) {
            return numbers[length / 2];
        } else {

            int middle1 = length / 2;
            int middle2 = middle1 - 1;
            return (double) (numbers[middle1] + numbers[middle2]) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();


        int[] sequence = new int[size];


        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            sequence[i] = scanner.nextInt();
        }

        scanner.close();


        double median = findMedian(sequence);
        System.out.println("Медиана последовательности: " + median);
    }
}
