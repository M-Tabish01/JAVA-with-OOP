package miniproject;

import java.util.Scanner;

public class MiniProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int RandomNum = (int) (Math.random() * 100);
        int user;
        do {
            System.out.println("Guess the number");
            user = input.nextInt();
            if (RandomNum == user) {
                System.out.println("WOW! NICE GUESS... GENIUS");
                break;
            } else if (user > RandomNum) {
                System.out.println("Your number is large");

            } else {
                System.out.println("Your number is small");
            }
        } while (user >= 0);
        
        System.out.printf("MY number was %d", user);
    }

}
