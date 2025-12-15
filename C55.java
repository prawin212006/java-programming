import java.util.Scanner;

public class C55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger age: ");
        int age = sc.nextInt();

        if (age <= 12) {
            System.out.println("Ticket Price: ₹100 (Child)");
        } else if (age < 60) {
            System.out.println("Ticket Price: ₹200 (Adult)");
        } else {
            System.out.println("Ticket Price: ₹150 (Senior Citizen)");
        }

    }
}
