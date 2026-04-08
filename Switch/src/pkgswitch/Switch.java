
package pkgswitch;
import java.util.Scanner;

public class Switch {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your percentage");
        int Marks = input.nextInt();
        
        switch(Marks/10){
            case 10:
            case 9:
                 System.out.println("A+");
                break;
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("B");
                break;
            case 6:
                System.out.println("C");
                break;
            case 5:
                System.out.println("D");
                break;
            case 4:
                System.out.println("E");
                break;
            default:
                System.out.println("Fail");
                
                
                
        }
    }
    
}
