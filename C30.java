import java.util.Scanner;

public class C30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangle: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangle: ");
        double side3 = scanner.nextDouble();
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            System.out.println("The sides form a valid triangle.");
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }
    }
}
