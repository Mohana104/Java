import java.util.Scanner;

public class floatingnumbers {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

              System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();

             num1 = Math.round(num1 * 1000.0) / 1000.0;
        num2 = Math.round(num2 * 1000.0) / 1000.0;

               if (num1 == num2) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }


        scanner.close();
    }
}
