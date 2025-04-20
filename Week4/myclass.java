class myclass{
//creating the variables

static int count=0;
final double pi=3.1415;
//creating a constructor 
myclass(){
count++;
}
//method to print the values
public void values(){
System.out.println(+count);
System.out.println(+pi);
}
//object and the main function
public static void main(String[] args){
  System.out.println("Name: S Mohana Maheswari; Roll No: AV.SC.U4CSE24314; Section: CSE-A");

myclass one=new myclass();
one.values();
myclass two=new myclass();
two.values();
myclass three=new myclass();
three.values();
myclass four=new myclass();
four.values();
}
}
