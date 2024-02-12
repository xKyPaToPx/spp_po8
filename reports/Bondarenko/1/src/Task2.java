import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        double[] array = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                array[i] = Double.parseDouble(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобразования в число: " + args[i]);
                return;
            }
        }

        int startIndex = 1, endIndex = 3;
        System.out.println(Arrays.toString(subarray(array, startIndex, endIndex)));
    }

    public static double[] subarray(double[] array, int startIndex, int endIndex) {
        if (startIndex > endIndex || startIndex < 0 || endIndex >= array.length) {
            return new double[0];
        }

        double[] newArr = new double[endIndex - startIndex];

        int j = 0;
        for (int i = startIndex; i < endIndex; i++) {
            newArr[j] = array[i];
            ++j;
        }

        return  newArr;
    }
}
