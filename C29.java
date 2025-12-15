import java.util.Scanner;

public class C29  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first angle of the triangle: ");
        int angle1 = scanner.nextInt();

        System.out.print("Enter the second angle of the triangle: ");
        int angle2 = scanner.nextInt();

        System.out.print("Enter the third angle of the triangle: ");
        int angle3 = scanner.nextInt();

        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("The angles form a valid triangle.");
        } else {
            System.out.println("The angles do not form a valid triangle.");
        }
    }
}
