class myclass{
int count;
double pi;
Static int count=0;
final double pi=3.145;
//creating constructor//
myclass(){
count++;
myclass.count;

}

//creating methods//
public void getcount(){
System.out.println("The count is:"+count);
}
public void getpi(){
System.out.println("the value of pi is:"+pi);
}

//creating objects//
public static void main(String[] args){
myclass o1=new myclass();
myclass o2=new myclass();
o1.getcount();
o2.getcount();
o1.getpi();
}
}