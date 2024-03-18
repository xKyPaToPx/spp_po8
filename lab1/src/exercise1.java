package lab1;

public class exercise1 {
    public static void main(String[] args) {
        int[] N = {5, 1, 3, 1};

        boolean allEqual = true;
        for (int i = 1; i < N.length; i++) {
            if (N[i] != N[0]) {
                allEqual = false;
                break;
            }
        }

        if (allEqual) {
            System.out.println("равны");
        } else {
            System.out.println("не равны");
        }
    }
}
