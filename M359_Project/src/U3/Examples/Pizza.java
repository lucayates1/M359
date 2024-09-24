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
    //the pizzas are equal if they have the same price
    //and the same toppings
    //equals method always returns a boolean
    //ALWAYS has one parameter of this class (pizza)
    public boolean equals(Pizza other) {
        if(this.getToppings().equals(other.getToppings()) &&
                this.getPrice() == other.getPrice()) {
            return true;
        }
        else {
            return false;
        }
    }

    public int compareTo(Pizza other){
        if(this.price < other.price){
            return -1;
        }
        else if(this.price > other.price){
            return 1;
        }
        else{
            return 0;
        }
    }
    /*
    public int compareTo(Pizza other){
        return this.numSlices - other.numSlices;
    }
     */






    /*
    the toString method ALWAYS returns a string and
    takes NO parameters
    when toString method exists, Java will call this method for oyu whenever you print a pizza reference
    variable. otherwise all that we see is the address
    in memory of where the ref var is stored
     */

    public String toString(){
        String str = ""; //str will get 'built up'
        str = "The pizza with " + toppings +
                " has " + numSlices + " slices costs " + price;
        return str;
    }


//    public String toString() {
//        return "Pizza{" +
//                "toppings='" + toppings + '\'' +
//                ", numSlices=" + numSlices +
//                ", price=" + price +
//                '}';
//    }

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

