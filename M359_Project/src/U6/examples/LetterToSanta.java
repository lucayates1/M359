package U6.examples;

import java.util.Scanner;

public class LetterToSanta {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = kb.nextLine();
        System.out.println("How many items are on your wish list?");
        int num = kb.nextInt();
        kb.nextLine();
        String[] myList = new String[num];
        String[] list = new String[num];
        boolean keepGoing = true;
        int index = 0;

        while (keepGoing && index < myList.length) {
            System.out.println("What do you want? QUIT to exit");
            String item = kb.nextLine();
            if(item.equalsIgnoreCase("QUIT")){
                keepGoing = false;
            }
            else {
                myList[index] = item;
                index++;
            }
        }

        printWishList(name,myList);

    }
    public static void printWishList(String name, String[] arr){
        System.out.println(name + "'s List is: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null) {
                System.out.println((i + 1) + ". " + arr[i]);
            }
        }
    }
}
