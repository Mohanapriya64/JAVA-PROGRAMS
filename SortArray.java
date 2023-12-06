import java.util.Scanner;
import java.util.HashSet;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare an array of integers
        int[] array = new int[size];

        // Input elements into the array
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Find and print duplicate elements
        findAndPrintDuplicates(array);

        scanner.close();
    }

    public static void findAndPrintDuplicates(int[] array) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();

        for (int num : array) {
            if (!uniqueSet.add(num)) {
                duplicateSet.add(num);
            }
        }

        System.out.println("Duplicate elements in the array:");

        for (int duplicate : duplicateSet) {
            System.out.print(duplicate + " ");
        }
    }
}
