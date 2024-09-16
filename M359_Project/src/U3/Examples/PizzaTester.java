package U3.Examples;

public class PizzaTester {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("pepperoni", 15.95, 6);
        Pizza p2 = new Pizza("Meat Lovers", 20.50, 8);
        System.out.println(p1);

        if (p1.getNumSlices() > 6) {
            System.out.println("your hungry ");
        }
        else {
                System.out.println(" why so little");
            }
        if (p2.getNumSlices() > 6) {
            System.out.println("your hungry ");
        }
        else {
            System.out.println(" why so little");
        }
        }
    }
}
