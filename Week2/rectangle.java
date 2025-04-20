import java.util.Scanner;

class rectangle {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        // Getting float input
        System.out.print("Enter a : ");
        float a = input.nextFloat();
        System.out.println(" entered a value  = " + a);
    	
        // Getting double input
        System.out.print("Enter b: ");
        float b = input.nextFloat();
        System.out.println(" entered b value = " + b);
        
        float A=a*b

        System.out.println("Area of Rectangle is "+A);
     }
}