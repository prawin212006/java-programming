import java.util.Scanner;

public class C28  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x-coordinate: ");
        int x = scanner.nextInt();

        System.out.print("Enter the y-coordinate: ");
        int y = scanner.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant I.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant II.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant III.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant IV.");
        } else if (x == 0 && y == 0) {
            System.out.println("The point (" + x + ", " + y + ") lies at the origin.");
        } else if (x == 0) {
            System.out.println("The point (" + x + ", " + y + ") lies on the Y-axis.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") lies on the X-axis.");
        }
    }
}
