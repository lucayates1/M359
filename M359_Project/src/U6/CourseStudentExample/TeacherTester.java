package U6.CourseStudentExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TeacherTester {
    public static void main(String[] args) throws FileNotFoundException {
        //read in text file
        // read in number of students for array size
        //create array of students

        //loop
        Scanner inF = new Scanner(new File("StudentScheduleData.txt"));
        int numStudents = inF.nextInt();
        inF.nextLine();
        Student[] myClass = new Student[numStudents];

        int index = 0;


        while (inF.hasNextLine()) {
            Course[] schedule = new Course[8];
            String name = inF.nextLine();

            for (int i = 0; i < schedule.length; i++) {
                String t = inF.nextLine();
                String c = inF.nextLine();
                String g = inF.nextLine();
                int p = inF.nextInt();
                if (inF.hasNextLine())
                    inF.nextLine();
                Course oneCourse = new Course(t, c, g, p);

                schedule[i] = oneCourse;

            }
            Student student = new Student(name, schedule);
            myClass[index] = student;
            index++;
        }
        for (Student s : myClass) {
            if(s != null) {
                System.out.println(s);
            }
        }
    }
}
