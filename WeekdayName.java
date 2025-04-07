import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number between 1 and 7
        System.out.print("Enter a number (1-7): ");
        int number = scanner.nextInt();

        // Use conditional statements to determine the weekday name
        String weekday;
        
        if (number == 1) {
            weekday = "Monday";
        } else if (number == 2) {
            weekday = "Tuesday";
        } else if (number == 3) {
            weekday = "Wednesday";
        } else if (number == 4) {
            weekday = "Thursday";
        } else if (number == 5) {
            weekday = "Friday";
        } else if (number == 6) {
            weekday = "Saturday";
        } else if (number == 7) {
            weekday = "Sunday";
        } else {
            weekday = "Invalid input! Please enter a number between 1 and 7.";
        }

        // Display the result
        System.out.println("The corresponding weekday is: " + weekday);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
