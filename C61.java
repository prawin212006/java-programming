import java.util.Scanner;

public class C61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int speed = sc.nextInt();
        System.out.print("Enter vehicle speed: ");
        

        if (speed > 100) {
            System.out.println("Over-speeding! Fine imposed.");
        } else {
            System.out.println("Speed is within limit");
        }

    }


}
