import java.util.Scanner;

public class C42  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bill amount: ");
        double bill = sc.nextDouble();
        double discount;

        if (bill < 1000) {
            discount = bill * 0.05;
        } else if (bill < 5000) {
            discount = bill * 0.10;
        } else {
            discount = bill * 0.15;
        }

        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + (bill - discount));
 }
}
