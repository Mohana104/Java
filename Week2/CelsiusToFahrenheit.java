import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius : ");
        double Celsius = input.nextDouble();
        
        double Fahrenheit = (Celsius*9/5)+32;
        
        System.out.println("Temperature in  Fahrenheit : " +  Fahrenheit );
        
        input.close();
    }
}
