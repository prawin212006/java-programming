import java.util.Scanner;

public class C58  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        String day = sc.next().toLowerCase();

        if (day.equals("saturday") || day.equals("sunday")) {
            System.out.println("Ticket Price: ₹200 (Weekend)");
        } else {
            System.out.println("Ticket Price: ₹150 (Weekday)");
        }

    }
}
