import java.util.Scanner;

public class C53  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature (°C): ");
        int temp = sc.nextInt();

        if (temp < 10) {
            System.out.println("Weather: Cold");
        } else if (temp <= 25) {
            System.out.println("Weather: Pleasant");
        } else if (temp <= 35) {
            System.out.println("Weather: Hot");
        } else {
            System.out.println("Weather: Heatwave");
        }

 }
}
