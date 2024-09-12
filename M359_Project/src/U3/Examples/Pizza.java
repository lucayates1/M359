package U3.Examples;

public class Pizza {
    private String toppings;
    private int numSlices;
    private double price;

    public Pizza(String toppings, double price, int numSlices) {
        this.toppings = toppings;
        this.price = price;
        this.numSlices = numSlices;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public int getNumSlices() {
        return numSlices;
    }

    public void setNumSlices(int numSlices) {
        this.numSlices = numSlices;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

