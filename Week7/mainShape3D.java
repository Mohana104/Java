abstarct class bird{
   abstract void fly();
    abstract void makesound();
}
  

class eagle extends bird{
   public void fly(){
     System.out.println("eagle is flying through wings");
}
    public void makesound(){
     System.out.println("eagle makes whistling sound");
}
}

class hawk extends bird{
   public void fly(){
     System.out.println("Hawks fly by flapping their wings rapidly then relying on momentum to glide through the air.");
}
    public void makesound(){
     System.out.println("hawk makes kee-eeeee-arr sound");
}
}

class mainbird_24{
public static void main(String[] args) {
System.out.println("Name:S Mohana Maheswari"+"; "+"Rollno:AV.SC.U4CSE24314"+" ;"+"Section:CSE-A");
hawk obj1=new hawk();
eagle obj2=new eagle();

obj1.fly();

obj2.fly();
obj1.makesound();
obj2.makesound();
}}

