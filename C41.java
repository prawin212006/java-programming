
import java.util.Scanner;

public class C41  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000; // Initial Balance
        int choice;

        System.out.println("===== MINI ATM =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
switch (choice) {
            case 1:
                System.out.println("Current Balance: " + balance);
                break;

            case 2:
                System.out.print("Enter amount to deposit: ");
                double dep = sc.nextDouble();
                balance += dep;
                System.out.println("New Balance: " + balance);
                break;

            case 3:
                System.out.print("Enter amount to withdraw: ");
                double wd = sc.nextDouble();
                if (wd <= balance) {
                    balance -= wd;
                    System.out.println("Withdrawal successful!");
                    System.out.println("Remaining Balance: " + balance);
                } else {
                    System.out.println("Insufficient balance!");
                }
                break;

            case 4:
                System.out.println("Thank you! Goodbye.");
                break;

            default:
                System.out.println("Invalid choice!");
        }

    }
}
