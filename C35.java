import java.util.Scanner;

public class C35  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first year: ");
        int year1 = scanner.nextInt();

        System.out.print("Enter the second year: ");
        int year2 = scanner.nextInt();

        // Compare the last digits of the two years
        if (year1 % 10 == year2 % 10) {
            System.out.println("The two years have the same last digit.");
        } else {
            System.out.println("The two years do not have the same last digit.");
        }
    }
}
