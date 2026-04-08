
package oop1;
import java.util.Scanner;
class Student{
    String name;
    String ID;
    String department;
    int semester;
    
public void studentinfo(){
    System.out.println(this.name);
    System.out.println(this.ID);
    System.out.println(this.department);
    System.out.println(this.semester);
}


}
public class Task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student1 = new Student();
        System.out.println("Enter your name");
        student1.name = input.nextLine();
        
        System.out.println("Enter your ID");
        student1.ID = input.nextLine();
        
        System.out.println("Enter your Department");
        student1.department = input.nextLine();
        
        System.out.println("Enter your Semester");
        student1.semester = input.nextInt();
        
        student1.studentinfo();
    }
    
}
