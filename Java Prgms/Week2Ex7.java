class Week2Ex7{
      
       public static void main(String[]args){
          int n=10;
          int f1=0,f2=1;
          System.out.println("fibanocci series:" +  f1  +"," +f2);
          for(int i =3;i<n;i++)
             {
               int f3=f1+f2;
               System.out.println(f3);
               f1=f2;
               f2=f3; 
             }
       }
}
 