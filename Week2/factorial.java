import java.util.Scanner;

class factorial {
  public static void main(String[] args) {
    
   
    Scanner input = new Scanner(System.in);
    System.out.println("Enter n value: ");
    int number = input.nextInt();
    System.out.println("You entered " + number);
    int fact=1;
    for(int i=1;i<=number;i++){
    fact=fact*i;
    System.out.println(fact);
    }
  }
}