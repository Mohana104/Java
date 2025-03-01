import java.util.Scanner;

class simpleinterest {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        
        System.out.print("Enter P : ");
        float P = input.nextFloat();
        System.out.println(" entered P value  = " + P);
    	

        System.out.print("Enter T: ");
        float T = input.nextFloat();
        System.out.println(" entered T value = " + T);
        
          
        System.out.print("Enter R: ");
        float R = input.nextFloat();
        System.out.println(" entered R value = " + R);
       
        float Simpleinterest=P*T*R/100; 
        System.out.println("Simple interest is:"+Simpleinterest);
    }
}
  