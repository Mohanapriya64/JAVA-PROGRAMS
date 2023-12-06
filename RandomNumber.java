import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        // Define the range for the random number
        int minRange = 1;
        int maxRange = 100;

        // Generate and print a random number within the specified range
        int randomNumber = generateRandomNumber(minRange, maxRange);
        System.out.println("Random number between " + minRange + " and " + maxRange + ": " + randomNumber);
    }

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
