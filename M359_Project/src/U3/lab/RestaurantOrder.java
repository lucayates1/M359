package U3.lab;

public class RestaurantOrder {
    private String currOrder = "";
    private String customerName;
    private boolean discount;
    private double discountPercent;
    private double taxPercent;
    private final double BURGERCOST = 10.99;
    private final double PIZZACOST = 12.99;
    private final double PASTACOST = 8.99;
    private final double SALADCOST = 6.99;
    private int burgerCount = 0;
    private int pizzaCount = 0;
    private int pastaCount = 0;
    private int saladCount = 0;



    public RestaurantOrder(String cName, double taxRate, double disPer){
        customerName = cName;
        taxPercent = taxRate;
        discountPercent = disPer;
    }
    public RestaurantOrder(String cName, double taxRate){
        customerName = cName;
        taxPercent = taxRate;
        discountPercent = 0;
    }

    public void addItem(String itemName, int quantity){
        if(itemName.equalsIgnoreCase("burger") && quantity > 0 ){
            burgerCount += quantity;
            currOrder += "Ordered " + quantity +  " " + itemName + "(s) \n";
        }
        if(itemName.equalsIgnoreCase("pizza") && quantity > 0){
            pizzaCount+= quantity;
            currOrder += "Ordered " + quantity + " " +  itemName + "(s) \n";
        }
        if(itemName.equalsIgnoreCase("pasta") && quantity > 0){
            pastaCount+= quantity;
            currOrder += "Ordered " + quantity +  " " +  itemName + "(s) \n";
        }
        if(itemName.equalsIgnoreCase("salad") && quantity > 0){
            saladCount+= quantity;
            currOrder += "Ordered " + quantity +  " " +  itemName + "(s) \n";
        }

        if(!itemName.equalsIgnoreCase("BURGER" ) && !itemName.equalsIgnoreCase("PIZZA" ) && !itemName.equalsIgnoreCase("PASTA" )
        && !itemName.equalsIgnoreCase("SALAD" ))
        {

            currOrder += "sorry," + itemName + " is not on the menu\n";
        }
        if(quantity <= 0){
            currOrder += "sorry," + itemName + " must be greater than 0\n";
        }
    }

    public String toString(){
        double subTotal = saladCount * SALADCOST + pastaCount * PASTACOST + burgerCount * BURGERCOST + pizzaCount * PIZZACOST;
        double taxAmount = subTotal * taxPercent;
        String fOutput = "------ Order for: " + customerName + " ------\n";
        fOutput += currOrder + "\n";
        fOutput += "Subtotal:\t\t$" + subTotal  +"\t\n";
        if(discount){
            fOutput += "\t Discount:\t" + discountPercent;
        }
        fOutput += "Tax\t" + "(" + taxPercent * 100 + "%):"+ "\t" +"$" + taxAmount + "\n";
        fOutput += "Total:\t\t\t$"  + (subTotal - taxAmount);
        fOutput += "\n------------------------------" + "\t\t\t\t\t";



        return fOutput;
    }
}
