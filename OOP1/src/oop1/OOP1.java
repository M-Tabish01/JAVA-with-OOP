
package oop1;

class Pen{
    String color;
    String type;
    int price;
    String brand;
    public void write(){
//    System.out.println(this.price);
    System.out.println("I am writing");
} 
    public void penfunctions(){
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println(this.brand);
        System.out.println(this.price);
    }
    
    
}


public class OOP1 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Black";
        pen1.type = "Ink pen";
        pen1.brand = "Dollar";
        pen1.price = 300;
        pen1.write();
        pen1.penfunctions();
    }
    
}
