import java.util.Scanner;

public class C18  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num >= 0 && num <= 9) {
            System.out.println(num + " is a single-digit number.");
        } else if (num >= 10 && num <= 99) {
            System.out.println(num + " is a two-digit number.");
        } else if (num >= 100 && num <= 999) {
            System.out.println(num + " is a three-digit number.");
        } else {
            System.out.println(num + " is not a single, two, or three-digit number.");
        }
    }
}
