public class University{
String universityName="Amrita Vishwa Vidyapeetham.";

class Department{
String deptName="Computer Science Engineering.";
int deptCode=101;
 void displayDeptDetails(){
 System.out.println("Department: "+deptName);
 System.out.println("Department Code: "+deptCode);
}
}

class Student{
String studentName="s.Mohana Maheswari";
int rollNumber=24314;
 void displayStudentDetails(){
  System.out.println("Student Name: "+studentName);
  System.out.println("Student roll number: "+rollNumber);
}
}

public static void main(String [] args){
University uni=new University();
System.out.println("University Name: "+uni.universityName);
System.out.println("-----Department Details-----");
University.Department dept= uni.new Department();
dept.displayDeptDetails();
System.out.println("-----Student Details-----");
University.Student student=uni.new Student();
student.displayStudentDetails();
}
}
