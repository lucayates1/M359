package U3.lab;

public class RestaurantOrderTester {
    public static void main(String[] args) {
        // 8% tax rate, no discount
        RestaurantOrder deSteph = new RestaurantOrder("DeSteph's Family", 0.08);
        deSteph.addItem("burger", 2);
        deSteph.addItem("PASTA", 2);
        deSteph.addItem("salad", 2);
        deSteph.addItem("Ice Cream", 4);
        deSteph.addItem("pasta", 0);
        System.out.println(deSteph);

        // 10% tax rate, 15% discount for first responders
        RestaurantOrder denna10_disc = new RestaurantOrder("Firefighter Denna", 0.1, 0.15);
        denna10_disc.addItem("pizza", 4);
        denna10_disc.addItem("pasta", 1);
        denna10_disc.addItem("SaLaD", 5);
        System.out.println(denna10_disc);
    }

}
