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
book b1=new  book("the story of honey","Priya",2020);
b1.titleofbook();
}
}

 
