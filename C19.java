import java.util.Scanner;

public class C19  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int product = num1 * num2;

        if (product > 0) {
            System.out.println("The product is positive.");
        } else if (product < 0) {
            System.out.println("The product is negative.");
        } else {
            System.out.println("The product is zero.");
        }
    }
}
