import java.util.Scanner;

public class C49  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int storedPin = 1234;

        System.out.print("Enter ATM PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == storedPin) {
            System.out.println("PIN Verified. You may proceed.");
        } else {
            System.out.println("Invalid PIN. Access Denied.");
         }

        }
}
