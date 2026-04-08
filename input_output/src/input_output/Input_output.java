
package input_output;

import java.util.Scanner;

public class Input_output {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println(age);
        
        System.out.print("Enter your marks ");
        float marks = input.nextFloat();
        
        System.out.print("Enter your name:    ");
        String name = input.next();  // Use for take a input only one word 
        System.out.println(name);
        
        System.out.print("Enter your Feedback:    ");
        String feedback = input.nextLine();  // Use for take a input full sentence
        System.out.println(feedback);
        
    }
    
}
