import java.util.Scanner;

public class C51  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light color: ");
        String color = sc.next().toLowerCase();

        if (color.equals("red")) {
            System.out.println("STOP");
        } else if (color.equals("yellow")) {
            System.out.println("READY");
        } else if (color.equals("green")) {
            System.out.println("GO");
        } else {
            System.out.println("Invalid color");
        }

    }
}
