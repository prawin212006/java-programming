import java.util.Scanner;

public class C4  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int difference = Math.abs(num1 - num2);

        if (difference % 2 == 0) {
            System.out.println("The difference is even.");
        } else {
            System.out.println("The difference is odd.");
        }
    }
}

