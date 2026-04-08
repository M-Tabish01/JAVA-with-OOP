package conditional;

import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean Adult = false;
        if (Adult == true) {
            System.out.println("Your Adult");
        }else {
            System.out.println("Your not adult");
        }
        System.out.print("ENter your age");
        int age = input.nextInt();
        if (age <= 18) {
            System.out.println("Your Adult");
        } else {
            System.out.println("Your not adult");
        }
    }
}
