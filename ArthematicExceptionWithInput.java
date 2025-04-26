import java.util.scanner
public class ArthematicExceptionWithInput{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
try{
System.out.println("Enter first number (numerator):");
int a =Scanner.nextInt();
System.out.println("Enter second number(denominator):");
int b=Scanner.nextInt();
int result=a/b;
System.out.println("result:"+result);
}
catch(ArthematicException e){
