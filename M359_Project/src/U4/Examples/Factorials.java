package U4.Examples;

import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int userInput = -1;


        while (userInput < 0) {
            System.out.print("Please enter a non-negative integer: ");
            if (kb.hasNextInt()) {
                userInput = kb.nextInt();
                if (userInput < 0) {
                    System.out.println("A non-negative number is required. Please try again.");
                }
            } else {
                System.out.println("That's not an integer. Please enter a non-negative integer.");
                kb.next();
            }
        }


        long factorial = calculateFactorial(userInput);
        System.out.println("The factorial of " + userInput + " is " + factorial + ".");

        kb.close();
    }


    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        long factorial = 1;
        while (n > 0) {
            factorial *= n;
            n--;
        }
        return factorial;
    }
}
