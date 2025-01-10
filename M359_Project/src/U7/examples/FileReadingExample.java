package U7.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingExample {
    public static void main(String[] args) throws FileNotFoundException {
        //12-20   17  Luca Yates/Fremd High School
        /*
        create a scanner to read this file
        create var for birthday,years, name, and school
        read this data from text time

         */
        Scanner inFile = new Scanner(new File("teacherData.txt"));
        String birthday;
        int years;
        String name;
        String school;
        birthday = inFile.next();
        years = inFile.nextInt();
        String restOfLine = inFile.nextLine();
       int loc = restOfLine.indexOf("/");
       name = restOfLine.substring(0, loc);
       school = restOfLine.substring(loc);
        System.out.println(birthday + " " + years + " " + name + " " + school);
    }
}
