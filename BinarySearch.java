import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the sorted array: ");
        int size = scanner.nextInt();

        // Declare a sorted array of integers
        int[] sortedArray = new int[size];

        // Input elements into the sorted array
        System.out.println("Enter the elements of the sorted array (in ascending order):");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            sortedArray[i] = scanner.nextInt();
        }

        // Get the element to search from the user
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();

        // Perform binary search and print the result
        int index = binarySearch(sortedArray, searchElement);

        if (index != -1) {
            System.out.println("Element " + searchElement + " found at index " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array");
        }

        scanner.close();
    }

    public static int binarySearch(int[] sortedArray, int target) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (sortedArray[mid] == target) {
                return mid; // Element found, return its index
            } else if (sortedArray[mid] < target) {
                low = mid + 1; // Adjust the search range to the right half
            } else {
                high = mid - 1; // Adjust the search range to the left half
            }
        }

        return -1; // Element not found
    }
}

