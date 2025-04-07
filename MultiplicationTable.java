import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

              System.out.print("Enter the number (table to be calculated): ");
        int number = scanner.nextInt();

            System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

       
        for (int i = 0; i <= terms; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }


        scanner.close();
    }
}
