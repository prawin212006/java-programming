
import java.util.Scanner;

public class C44  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 60) {
            System.out.println("Eligible for Senior Citizen benefits");
        } else {
            System.out.println("Not eligible for Senior Citizen benefits");
        }

    }
}
