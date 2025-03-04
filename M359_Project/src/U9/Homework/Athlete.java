package U9.Homework;

public class Athlete {
    private String name;
    private int age;

    public Athlete(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Athlete(){
        name = "None";
        age = 0;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String s){
        this.name = s;
    }
    public void setAge(int a){
        this.age = a;
    }
}
