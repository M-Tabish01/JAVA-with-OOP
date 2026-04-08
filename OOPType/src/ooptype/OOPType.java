//Polymorphisom (Compile time)
// Many function of same name in one class (Function overloading)
package ooptype;

class Student{
    String name;
    int age;
    
    public void printinfo(String name){
        System.out.println(name);
    }
    
    public void printinfo(int age){
        System.out.println(age);
    }
    
    public void printinfo(String name, int age){
        System.out.println(name+" "+ age);
    }
    
}
public class OOPType {


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ayeshe";
        s1.age = 19;
        s1.printinfo("Tabish");
        
    }
    
}
 