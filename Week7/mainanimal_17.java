abstract class animal{
  abstract void sound();
}

class  Lion  extends animal{
   public void sound(){
      System.out.println("Lion makes roar sound");
}}
 class Tiger extends animal{
   public void sound(){
    System.out.println("Tiger makes moaning sound");
}}

class mainanimal_17{
 public static void main(String[] args) {
System.out.println("Name:S Mohana Maheswari"+"; "+"Rollno:AV.SC.U4CSE24314"+" ;"+"Section:CSE-A");
  Tiger obj1=new Tiger();
  Lion obj2=new Lion();
  
  
  obj1.sound();
obj2.sound();
}}