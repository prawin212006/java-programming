import java.util.Scanner;

public class C36  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.print("Enter a month (1 to 12): ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid month.");
        } else {
            int days = 0;
            switch (month) {
                case 1: 
                case 3:
                case 5:  
                case 7:  
                case 8:  
                case 10: 
                case 12: 
                    days = 31;
                    break;
                case 4:  
                case 6:  
                case 9:  
                case 11: 
                    days = 30;
                    break;
                case 2: 
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        days = 29; 
                    } else {
                        days = 28;  
                    }
                    break;
            }
            System.out.println("The month " + month + " in year " + year + " has " + days + " days.");
        }
    }
}

