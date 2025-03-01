import java.util.Scanner;

class F_C {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        // Getting float input
        System.out.print("Enter F : ");
        float F= input.nextFloat();
        System.out.println(" entered a value  = " + F);
    	
               
        float C =(5/9)*(F-32);
        System.out.println(C);
     }
}
