import java.util.Scanner;
    
   public class Student {
   String name = "";
   int age = 0;
   String gender = "";
   double GPA = 0.0;
   
   public Student(String name, int age, String gender, double GPA){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.GPA = GPA;
   }

   public void display(){
       System.out.println("Name :"+ this.name);
       System.out.println("Age :"+ this.age);
       System.out.println("Gender : "+this.gender);
       System.out.println("GPA :"+this.GPA);
   }
   public static void main(String[] args) {
       Student s = new Student("Dat",20,"Nam",9.5);
       s.display();
   }
}
