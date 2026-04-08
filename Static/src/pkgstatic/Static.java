// when we use static with any variable or function we can access them without making a object
package pkgstatic;

class Student{
    public String name;
    static String school;
    public static void school(){
        school = "Beacon House";
    }
    
}
public class Static {


    public static void main(String[] args) {
        Student.school = "OCS";
        Student s1 = new Student();
        Student s2 = new Student();
        Student.school();
        s1.name = "Muhamamd Tabish";
        System.out.println(s1.name +" "+ s1.school);
        s2.name = "Hammad";
        System.out.println(s2.name + " " + s2.school);
        
    }
    
}
