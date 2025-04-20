class book{
String titleofthebook;
String Author;
int yearofpublication;
 

//creating constructor//

book(String titleofthebook,String Author,int yearofpublication){
this.titleofthebook=titleofthebook;
this.Author=Author;
this.yearofpublication=yearofpublication;
}

//creating a methods//
public void titleofbook(){


System.out.println("The Title of book is :"+titleofthebook);

}
public void Author(){
System.out.println("The Author of book is :"+Author);
}

public void yearofpublication(){
System.out.println("The book is published in the year :"+yearofpublication);
}


//creating objects//
public static void main(String[] args){
System.out.println("Name:S Mohana Maheswari"+" "+"Rollno:AV.SC.U4CSE24314"+" "+"Section:CSE-A");



book b1=new  book( "A Lack of Order in the Floating Object Room","George Saunders",1986);
book b2=new  book("Cattle Haul","Jesmyn Ward",2008);

b1.titleofbook();
b1.Author();
b2.titleofbook();
b2.yearofpublication();

}
}

 