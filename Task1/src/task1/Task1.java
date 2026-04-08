
package task1;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       System.out.print("How much money do you have");
       int money = input.nextInt();
       
       if(money < 10){
           System.out.println("Insuficiant money");
       }
       else if (money > 10 && money <50){
           System.out.println("You can get one thing");
       }
       else{
           System.out.println("You can get both");
       }
    }
    
}
