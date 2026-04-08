// Inheritance
// use for reuse the properties we dont have to write each property we can simply use by using inheritence 
// there are 4 types of inheritance 
//type 1 is Single level inheritance
package ooptype;

class Shape{    //Parent class
    String color;
    public void area()
    {
        System.out.println("Display area");
    }
}

class Triangle extends Shape{   // Child class
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

// type 2 Multi level 

class EquilatteralTriangle extends Triangle{ // child class of child class
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

// type 3 Hirarchy one parent multiple childs

class Circle extends Shape{
        public void area(int r){
            System.out.println((3.14)*r*r);
        }
}

// type 4 Hybrid
// in Hybrid heritance sometimes we see single sometimes multi sometimes hirarchy Heeritance 



public class OOPType2 {


    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Blue";
        System.out.println(t1.color);
        
        
        
        
    }
   
}
