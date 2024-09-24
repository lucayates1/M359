package U3.Examples;

public class Student {
    private String fName, lName;
    private int idNum;


    public Student(String fName, int idNum, String lName) {
        this.fName = fName;
        this.idNum = idNum;
        this.lName = lName;
    }

    public boolean equals(Student other){
       return (this.fName.equals(other.fName) &&
               this.lName.equals(other.lName));
    }

    public int compareTo(Student other) {
        if (this.lName.equals( other.lName)){
            return this.fName.compareTo(other.fName);
        }
        else{
            return this.lName.compareTo(other.lName);
        }
    }






    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
}
