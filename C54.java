import java.util.Scanner;

public class C54  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();

        if (battery >= 80) {
            System.out.println("Battery Status: Full");
        } else if (battery >= 30) {
            System.out.println("Battery Status: Moderate");
        } else {
            System.out.println("Battery Status: Low");
        }

    }
}

