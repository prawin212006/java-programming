import java.util.Scanner;

public class C12  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int lastDigit = num % 10; // Get the last digit of the number

        if (lastDigit % 2 == 0) {
            System.out.println("The last digit is even.");
        } else {
            System.out.println("The last digit is odd.");
        }
    }
}

