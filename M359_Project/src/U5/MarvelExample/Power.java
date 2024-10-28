package U5.MarvelExample;

public class Power {
    private String type;
    private int strength; // [0-10]

    public Power(String type, int strength) {
        this.type = type;
        this.strength = strength;
    }
    public String toString(){
        return type + " " + strength;
    }
    public String getTypeOfPower() {
        return type;
    }

    public void setTypeOfPower(String type) {
        this.type = type;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
