
package operator;

import java.util.Scanner;
public class Operator {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);  
        
        int c = 11;
        c++;
        System.out.println(c);
        
        System.out.print("Enter your Feedback:    ");
        String feedback = input.nextLine();  // Use for take a input full sentence
        System.out.println(feedback);
    }
    
}
