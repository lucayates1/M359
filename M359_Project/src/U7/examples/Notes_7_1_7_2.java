package U7.examples;

import java.util.ArrayList;

public class Notes_7_1_7_2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Maggie");
        names.add("Anarghya");
        names.add("Josh");
        names.add("Charlie");
        System.out.println(names.size());
        String replacedName = names.set(3, "Sean");
        System.out.println(replacedName);
        names.add(1, "Mercy");
        System.out.println(names);


        ArrayList ages = new ArrayList<>();
        ages.add(15);
        ages.add("Twelve");
        String age = (String) ages.get(1);
    }
}
