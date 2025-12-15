import java.util.Scanner;

public class C20  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        int asciiValue = (int) character;

        if (asciiValue % 2 == 0) {
            System.out.println("The ASCII value of '" + character + "' is even.");
        } else {
            System.out.println("The ASCII value of '" + character + "' is odd.");
        }
    }
}

