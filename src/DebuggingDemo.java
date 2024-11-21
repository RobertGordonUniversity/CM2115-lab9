import java.util.Scanner;

public class DebuggingDemo {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i <= size; i++) { 
            numbers[i] = scanner.nextInt();
        }

        int max = findMax(numbers);
        System.out.println("The maximum number is: " + max);

    }

    public static int findMax(int[] arr) {
        int max = 0; 

        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

}
