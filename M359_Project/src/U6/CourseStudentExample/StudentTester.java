package U6.CourseStudentExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) throws FileNotFoundException {
        Course class1 = new Course("Vlaming", "Basketball PE", "A", 1 );
        Course class2 = new Course("Higgins", "Trig Calc A", "B+", 2 );
        Course class3 = new Course("O'Dette", "Physics 1", "A-", 3 );
        Course class4 = new Course("Lunch", 4);
        Course class5 = new Course("Gerber", "AP Lit", "A+", 5 );
        Course class6 = new Course("Ganas", "AP Psych", "B+", 6 );
        Course class7 = new Course("Study Hall", 7);
        Course class8 = new Course("Lernor", "Spanish 3", "A-", 8 );

        Course[] mySchedule = {class1, class2, class3,class4,class5,class6,class7,class8};
        Student s = new Student("Luca", mySchedule);
        System.out.println(s);
        //create a scanner so that i can read data from a new file called oneCourse.txt
        Scanner inF = new Scanner(new File("oneCourse.txt"));

        String teacher = inF.nextLine();
        String className = inF.nextLine();
        String grade = inF.nextLine();
        int period = inF.nextInt();

        Course class9 = new Course(teacher,className,grade,period);
        System.out.println(class9);
        inF.close();

        Scanner inSchedule = new Scanner(new File("oneSchedule.txt"));
        String name = inSchedule.nextLine();
        Course[] schedule = new Course[8];
        for(int i = 0; i < schedule.length; i++){
            String t = inSchedule.nextLine();
            String c = inSchedule.nextLine();
            String g = inSchedule.nextLine();
            int p = inSchedule.nextInt();
            if(inSchedule.hasNextLine())
            inSchedule.nextLine();
            Course oneCourse = new Course(t,c,g,p);

            schedule[i] = oneCourse;
        }
        Student student = new Student(name, schedule);
        System.out.println(student);
    }
}
