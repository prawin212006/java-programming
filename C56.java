import java.util.Scanner;

public class C56  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle speed (km/h): ");
        int speed = sc.nextInt();

        if (speed > 100) {
            System.out.println("Warning: Overspeeding!");
        } else {
            System.out.println("Speed is within limit.");
        }

    }
}
