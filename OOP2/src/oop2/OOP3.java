package oop2;

class Student {

    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name);
        System.out.println(age);
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;

    }
    
    
    
}

public class OOP3 {

    public static void main(String[] args) {
        Student s1 = new Student("Tabish", 30);
        Student s2 = new Student(s1);
        s2.printInfo();
    }

}
