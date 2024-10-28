package U5.MarvelExample;

public class MarvelTester {
    public static void main(String[] args) {
        MarvelCharacter ironMan = new MarvelCharacter("Ironman", true, new Power("Flight", 7));
        MarvelCharacter thanos = new MarvelCharacter("Thanos", false, new Power("Snap", 10));
        Power web = new Power("Webslinging ", 8);
        MarvelCharacter spiderman = new MarvelCharacter("Spiderman", true, web);
        System.out.println(ironMan);
        System.out.println(thanos);
        System.out.println(spiderman);

        ironMan.updatePowerStrength(-5);
        thanos.updatePowerStrength(100000000);

        System.out.println(ironMan);
        System.out.println(thanos);
    }


    /**
     * 
     * @param hero
     * @param villian
     */
    public static void battle(MarvelCharacter hero, MarvelCharacter villian){
        int heroStr = hero.getSuperPower().getStrength();
        int villianStr = villian.getSuperPower().getStrength();
        double chance = Math.random();
        //if chance <= 0.85  then stronger wins
        if(heroStr > villianStr){
            //hero is stronger
            if(chance < 0.85){
                //hero wins
                int diff = heroStr - villianStr;
                hero.updatePowerStrength(diff);
                villian.updatePowerStrength(-1 * diff);
            }
        }
        else{
            //villian wins
        }
    }
}
