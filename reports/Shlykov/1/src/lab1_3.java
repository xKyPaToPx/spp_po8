import java.util.Scanner;

public class lab1_3 {
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            scanner.close();
            String result = capitalize(input);
            System.out.println("Результат капитализации: " + result);
        }
    
        public static String capitalize(String str) {
            if (str == null) {
                return null;
            }
            if (str.trim().isEmpty()) {
                return str;
            }
            String[] words = str.trim().split("\\s+");
            StringBuilder result = new StringBuilder();
            for (String word : words) {
                if (word.length() > 0) {
                    result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
                }
            }
            return result.toString().trim();
        }
    }

