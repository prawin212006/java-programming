import java.util.Scanner;

public class C34  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        
        int firstTwoDigits = year / 100;  
        int lastTwoDigits = year % 100;   

        if (firstTwoDigits == lastTwoDigits) {
            System.out.println("The first two digits and last two digits of " + year + " are equal.");
        } else {
            System.out.println("The first two digits and last two digits of " + year + " are not equal.");
        }
    }
}
