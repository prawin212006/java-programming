import java.util.Scanner;

public class C60  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data usage percentage: ");
        int usage = sc.nextInt();

        if (usage < 50) {
            System.out.println("Low Data");
        } else if (usage == 50) {
            System.out.println("Half Consumed");
        } else {
            System.out.println("Data Over");
        }
    
    }
}
