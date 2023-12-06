import java.util.Scanner;

public class ArrayElements {
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

        // Print the elements of the array
        System.out.println("Elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
