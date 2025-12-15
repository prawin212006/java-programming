import java.util.Scanner;

public class C33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a century year
        if (year % 100 == 0) {
            System.out.println(year + " is a century year.");
        } else {
            System.out.println(year + " is not a century year.");
        }
    }
}

