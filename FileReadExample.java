import java.io.*;
public class FileReadExample{
public static void main(String[] args)throws IOException{
try{
BufferedReader br=new BufferedReader(new FileReader("E:/Amrita/Example.txt"));
String line;
while ((line=br.readLine())!=null){
System.out.println(line);
}
br.close();
}catch(FileNotFoundException e){
System.out.println("File Not Found:"+e.getMessage());
}
catch(IOException e){
System.out.println("An error while reading the file:"+e.getMessage());
}}}