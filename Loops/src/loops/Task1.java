
package loops;

import java.util.Scanner;
public class Task1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user = 0;
        do{
        System.out.print("Enther the number");
        user = input.nextInt();
        
        System.out.print("Here yours number");
        System.out.print(user);
        System.out.println("");
        }while(user > 0);
        
    }
    
}
