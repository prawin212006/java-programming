import java.util.Scanner;

public class C11  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = scanner.nextInt();

        int firstDigit = num / 100; // Get the first digit of the 3-digit number

        if (firstDigit % 2 == 0) {
            System.out.println("The first digit is even.");
        } else {
            System.out.println("The first digit is odd.");
        }
    }
}


