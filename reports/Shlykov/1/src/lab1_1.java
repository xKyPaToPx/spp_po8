public class lab1_1 {
        public static void main(String[] args) {
        int[] numbers = {50, 20, 5, 20, 15};
        double average = calculateAverage(numbers);
        System.out.println("Среднее значение: " + average);
        double percent = calculatePercent(numbers, average);
        System.out.println("Процент чисел: " + percent + "%");
    }

    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static double calculatePercent(int[] numbers, double average) {
        int count = 0;
        for (int num : numbers) {
            if (num > average) {
                count++;
            }
        }
        return (double) count / numbers.length * 100;
    }
}
