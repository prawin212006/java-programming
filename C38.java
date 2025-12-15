import java.util.Scanner;

public class C38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0–100): ");
        int marks = sc.nextInt();

        String grade;

        switch (marks / 10) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            default:
                grade = "Fail";
        }

        System.out.println("Grade: " + grade);
    }
}
