package U5.MarvelExample;

public class MarvelCharacter {
    private String name;
    private boolean isHero;
    private Power superPower;


    public MarvelCharacter(String name, boolean isHero, Power superPower) {
        this.superPower = superPower;
        this.name = name;
        this.isHero = isHero;
    }
    public void updatePowerStrength(int val){
        int newStrength = superPower.getStrength() + val;

        if(newStrength < 0){
            newStrength = 0;
        }
        else if (newStrength > 10){
            newStrength = 10;
        }

        superPower.setStrength(newStrength);
    }
    public String toString(){
        String str = "";
        if(isHero){
            str += "Hero: ";
        }
        else {
        str += "Villian: ";
        }
        str += name + ", " + superPower;
        return str;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }

    public boolean isHero() {
        return isHero;
    }

    public void setHero(boolean hero) {
        isHero = hero;
    }
}
