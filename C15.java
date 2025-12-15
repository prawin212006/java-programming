import java.util.Scanner;

public class C15  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 3 == 0 || num % 7 == 0) {
            System.out.println(num + " is divisible by either 3 or 7.");
        } else {
            System.out.println(num + " is not divisible by either 3 or 7.");
        }
    }
}
