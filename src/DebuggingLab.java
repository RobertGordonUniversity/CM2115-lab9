import java.util.Scanner;

/* 
 * Use the VSCode debugging tools to debug the following code
 * The code should print out the factorial of the given number - 
 * a factorial is a number multiplied by all the numbers before it
 * So 5 factorial is 5 x 4 x 3 x 2 x 1
 * 8 factorial is 8 x 7 x 6 x 5 x 4 x 3 x 2 x 1
 * and so on
 */

public class DebuggingLab {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer to calculate its factorial: ");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);

        System.out.println("The factorial of " + number + " is: " + factorial);

    }

    // Method to calculate factorial
    public static long calculateFactorial(int num) {
        long result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        if (num <= 0) {
            return -1;
        }

        return result;
    }
}
