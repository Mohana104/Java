class car{
//creating the attributes required fo the class
String car_color,car_brand,fuel_type;
int maleage;
//constructor
car(String car_color, String car_brand, String fuel_type,int maleage){
this. car_color=car_color;
this.car_brand=car_brand;
this. fuel_type=fuel_type;
this.maleage=maleage;
}

//creating methods for the class

public void start(){
 System.out.println("The "+car_brand+ " "+"car gets started" +" "+ "which is in"+" "+ car_color +"color");
}
public void stop(){
 System.out.println("The car is stopped due to less"+" " + fuel_type);
}
public void service(){
 System.out.println("The car is in servicing " +"has "+ maleage+" "+ "maleage");
}

public static void main(String[] args) {
//creating the objects for the class
car car1=new car("navy blue","maruthi""petrol",300);
car1.start();

car car2=new car("navy blue","Honda","petrol",400);
car2.stop();

car car3=new car("black","maruthi","petrol",500);
car3.service();

}
}




