package lab1;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int size = scanner.nextInt();

        int[] N = new int[size];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            N[i] = scanner.nextInt();
        }

        boolean allEqual = true;
        for (int i = 1; i < N.length; i++) {
            if (N[i] != N[0]) {
                allEqual = false;
                break;
            }
        }

        if (allEqual) {
            System.out.println("Элементы массива равны.");
        } else {
            System.out.println("Элементы массива не равны.");
        }

        scanner.close();
    }
}
