abstract class Patternprinter
{
    abstract  void patternprinting(int n);
}
class StarPattern extends Patternprinter
{
void patternprinting(int n)
{
    System.out.println("Star pattern");
    
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    }

class Numberpattern extends Patternprinter

    {
    void patternprinting(int n)
    {
        System.out.println("Number pattern");
 
      
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
            System.out.print(j);
            }
            System.out.println();
        }
    
    }
}

public class patternmain
{
    public static void main (String args[])
    {
      StarPattern S=new StarPattern();
      Numberpattern N=new Numberpattern();
      S.patternprinting(5);
      N.patternprinting(5);

    }
}
