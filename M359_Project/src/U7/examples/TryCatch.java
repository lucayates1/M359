package U7.examples;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


        int myChoice = getIntChoice(kb);

        boolean keepgoing = true;


    }
    public static int getIntChoice(Scanner kb){


        boolean keepgoing = true;
        int num = -1;
        while (keepgoing) {
            System.out.println("Enter an int between 1 and 5");
            // use a try catch block to safely read the int
            try {
                 num = kb.nextInt();
                //if i am still here,they entered an int

                if (num >= 1 && num <= 5) {
                    System.out.println("You entered " + num);
                    keepgoing = false;
                } else {
                    System.out.println("You must enter a number between 1 and 5");
                }
            } catch (Exception e) {
                System.out.println("You must enter an integer");



            }
        }
        return num;
    }
}
