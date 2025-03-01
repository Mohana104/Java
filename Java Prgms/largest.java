import java.util.Scanner;

class largest {
  public static void main(String[] args) {
    
   
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your n1: ");
    int n1 = input.nextInt();
    
    System.out.println("Enter your n2: ");
    int n2 = input.nextInt();
 
    int largest = (n1 >= n2) ? n1  : n2 ;

    System.out.println("Largest Number: " + largest);
  }
}



