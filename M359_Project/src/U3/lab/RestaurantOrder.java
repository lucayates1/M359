package U3.lab;

public class RestaurantOrder {
    private String currOrder;
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
        if(itemName.equalsIgnoreCase("burger")){
            burgerCount += quantity;
            currOrder += "Ordered " + quantity +  itemName + "(s) \n";
        }
        if(itemName.equalsIgnoreCase("pizza")){
            pizzaCount+= quantity;
            currOrder += "Ordered " + quantity +  itemName + "(s) \n";
        }
        if(itemName.equalsIgnoreCase("pasta")){
            pastaCount+= quantity;
            currOrder += "Ordered " + quantity +  itemName + "(s) \n";
        }
        if(itemName.equalsIgnoreCase("salad")){
            saladCount+= quantity;
            currOrder += "Ordered " + quantity +  itemName + "(s) \n";
        }

        if(!itemName.equalsIgnoreCase("BURGER || PIZZA || PASTA || SALAD")){
            currOrder += "sorry," + itemName + " is not on the menu\n";
        }
        if(quantity <= 0){
            currOrder += "sorry," + itemName + " must be greater than 0\n";
        }
    }

    public String toString(){
        double subTotal = saladCount * SALADCOST + pastaCount * PASTACOST + burgerCount * BURGERCOST + pizzaCount * PIZZACOST;
        double taxAmount = subTotal / taxPercent;
        String fOutput = "------ Order for: " + customerName + " ------\n";
        fOutput += currOrder + "\n";
        fOutput += "Subtotal:\t$" + subTotal  +"\t";
        fOutput += "Tax\t" + "(" + taxPercent + "%):\t$" + taxAmount;
        fOutput += "Total:\t\t "  + (subTotal - taxAmount);
        fOutput += "------------------------------";



        return fOutput;
    }
}
