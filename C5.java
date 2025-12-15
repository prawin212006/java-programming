import java.util.Scanner;

public class C5  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num >= 100 && num <= 999) {
            System.out.println(num + " is a 3-digit number.");
        } else {
            System.out.println(num + " is not a 3-digit number.");
        }
    }
}
