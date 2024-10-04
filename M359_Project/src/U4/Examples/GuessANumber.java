package U4.Examples;

import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int randomNum = (int) ((Math.random()  * 10 ) +1);
        int input = 0;
        int count = 0;
        while (input != randomNum) {
            System.out.println("Guess a number from 1-10:");
            input = kb.nextInt();
            if(input == randomNum){
                count++;
                System.out.println("Congrats! You guessed the number " + randomNum + " in " + count + " guesses");
            }
            else{
                count++;
                if(input > randomNum){
                    System.out.println("Your guess is too high");
                }
                if(input < randomNum){
                    System.out.println("Your guess is too low");
                }
            }
            }
    }
}
