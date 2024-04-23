package pkj1;

import java.util.Scanner;

public class TaskM1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();

        String dayName;

        switch (dayNumber) { 
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day number";
        }

        System.out.println("The day corresponding to the number " + dayNumber + " is " + dayName);

        scanner.close();
    }
}
