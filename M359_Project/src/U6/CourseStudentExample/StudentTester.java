package U6.CourseStudentExample;

public class StudentTester {
    public static void main(String[] args) {
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


    }
}
