import java.util.Scanner;

public class C8  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int lastDigit = num % 10;

        if (lastDigit % 3 == 0) {
            System.out.println("The last digit " + lastDigit + " is divisible by 3.");
        } else {
            System.out.println("The last digit " + lastDigit + " is not divisible by 3.");
        }
    }
}
