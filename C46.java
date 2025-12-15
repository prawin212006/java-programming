import java.util.Scanner;

public class C46  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        if (temp > 100) {
            System.out.println("Fever detected");
        } else {
            System.out.println("Normal temperature");
        }
    
    }
}
