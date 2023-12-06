import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from the user
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();

        // Reverse the string
        String reversedString = reverseString(inputString);

        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right positions
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}
