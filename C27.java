import java.util.Scanner;

public class C27  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangle: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangle: ");
        double side3 = scanner.nextDouble();

        // Check if the triangle is right-angled using Pythagoras' theorem
        if (side1 * side1 + side2 * side2 == side3 * side3 ||
            side2 * side2 + side3 * side3 == side1 * side1 ||
            side1 * side1 + side3 * side3 == side2 * side2) {
            System.out.println("The triangle is right-angled.");
        } else {
            System.out.println("The triangle is not right-angled.");
        }
    }
}
