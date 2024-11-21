package U6.CourseStudentExample;

import java.util.Arrays;

public class Student {
    private String name;
    Course[] myClasses;

    public Student(String name) {
        this.name = name;
        this.myClasses = new Course[8];
    }

    public Student(String name, Course[] myClasses) {
        this.name = name;
        this.myClasses = myClasses;
    }


    public String toString() {
        String output = "";
        for (int i = 0; i < myClasses.length; i++) {

            output += myClasses[i].toString() + "\n";

        }
        return "Student Name: " + name + "\n" + output;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getMyClasses() {
        return myClasses;
    }

    public void setMyClasses(Course[] myClasses) {
        this.myClasses = myClasses;
    }
}
