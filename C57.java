import java.util.Scanner;

public class C57  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String mobile = sc.next();

        if (mobile.length() == 10) {
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Number");
        }

    }
}
