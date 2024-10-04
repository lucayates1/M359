package U4.Examples;

import java.util.Scanner;

public class FindAverageWhileLoop {
    //make a scanner
    public static void main(String[] args) {


        Scanner kb = new Scanner(System.in);
        //initialize variables
        int input = 0;
        int sum = 0;
        int count = 0;
        double average = 0.0;
        // use a while loop

        //-999 is a sentinel value and when the user enters it they are done
        while (input != -999) {
            System.out.println("Enter a number (-999 to quit)");
            input = kb.nextInt();
            if(input != -999){
                count++;
                sum += input;
            }

        }
        System.out.println((double)sum / count );
        //find and print average
    }
}
