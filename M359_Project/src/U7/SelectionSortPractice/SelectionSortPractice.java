package U7.SelectionSortPractice;

import java.util.ArrayList;

public class SelectionSortPractice {
    public static void main(String[] args) {

        ArrayList<Student> myClass = new ArrayList<>();
        myClass.add(new Student("Sora", 15));
        myClass.add(new Student("Jaime", 14));
        myClass.add(new Student("Jill", 15));
        myClass.add(new Student("Sruthi", 14));
        myClass.add(new Student("Aarush", 15));
        myClass.add(new Student("Dylan", 16));
        myClass.add(new Student("Peter", 16));
        myClass.add(new Student("Aayan", 15));
        myClass.add(new Student("Rithesh", 17));
        myClass.add(new Student("Anirudh", 18));


        System.out.println("Original class list");
        printStudents(myClass);


        sortByAge(myClass);
        System.out.println("\nSorted by Age");
        printStudents(myClass);


        sortByName(myClass);
        System.out.println("\nSorted by Name");
        printStudents(myClass);
    }


    public static void sortByName(ArrayList<Student> students) {
        for(int i = 0; i < students.size() - 1; i++){
            int minIndex = i; //not 0
            for(int j = i + 1; j <students.size(); j++){

                if(students.get(minIndex).getName().compareTo(students.get(j).getName()) > 0){
                    minIndex = j;
                }
            }
            Student temp = students.get(minIndex);
            students.set(minIndex, students.get(i));
            students.set(i,temp);
        }

    }


    public static void sortByAge(ArrayList<Student> students) {
    for(int i = 0; i < students.size() - 1; i++){
        int minIndex = i; //not 0
        for(int j = i + 1; j <students.size(); j++){

            if(students.get(minIndex).getAge() > students.get(j).getAge()){
                minIndex = j;
            }
        }
        Student temp = students.get(minIndex);
        students.set(minIndex, students.get(i));
        students.set(i,temp);
        }

    }


    public static void printStudents(ArrayList<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}






