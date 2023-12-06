import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        int asciiValue = findASCIIValue(inputChar);

        System.out.println("The ASCII value of '" + inputChar + "' is: " + asciiValue);

        scanner.close();
    }

    public static int findASCIIValue(char ch) {
        return (int) ch;
    }
}
