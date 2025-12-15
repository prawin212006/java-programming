import java.util.Scanner;

public class C50  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        if (amount <= balance && amount % 100 == 0) {
            System.out.println("Withdrawal Successful.");
            System.out.println("Remaining Balance: ₹" + (balance - amount));
        } else {
            System.out.println("Invalid Withdrawal Request.");
        }

    }
}
