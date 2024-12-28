import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElementCounterJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers separated by commas:");
        String input = scanner.nextLine();

        try {
            String[] inputArray = input.split(",");
            int[] arr = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Integer.parseInt(inputArray[i].trim());
            }
            Map<Integer, Integer> countMap = countElements(arr);
            System.out.println(countMap);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a list of integers separated by commas.");
        }
    }

    public static Map<Integer, Integer> countElements(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        return countMap;
    }
}