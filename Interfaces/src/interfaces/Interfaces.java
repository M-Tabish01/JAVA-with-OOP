//interfaces doesnt have constructor 
// IN interfaces non-abstract function is not allowed 
package interfaces;

interface Animal{
    void walk();
     
    
}

class Horse implements Animal{
    public void walk(){
        System.out.println("Run with 4 legs");
    }
    
    
}

public class Interfaces {


    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
