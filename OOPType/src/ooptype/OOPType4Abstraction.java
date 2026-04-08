//Abstraction
package ooptype;

abstract class Animal{
    
    abstract void walk();
    
    public void eats(){
        System.out.println("You eat grass");
    }
    // constructor 
    
    Animal(){

    System.out.println("Hello Animal");

}
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on 4 legs");   
    }

    Horse(){
        System.out.println("Hello HORSE");
    }
    
    
}

class Chiken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
        
    }
    

}

public class OOPType4Abstraction {


    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        System.out.println("What are you doing");
        horse.eats();
        
        
    }
    
}
