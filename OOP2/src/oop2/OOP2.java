
package oop2;
// name of class and constructor will be same
// Connstructor doesnt have any return types
// only one time constructor can be callef for the one object
class Student{
    String name;
    int age;
    public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}
    
    Student(){
    System.out.println("Constructor called");
}
    
}

public class OOP2 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "tabish";
        s1.age = 5;
        
        s1.printInfo();
        
    }
    
}
