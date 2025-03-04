package U9.Homework;

public class AthleteTester {
    public static void main(String[] args) {
        // Create an Athlete a1 named Mike who is 16
        Athlete a1 = new Athlete("mike", 16);
        // change the name of a1 to be Michael
        a1.setName("Michael");
        // Create a TeamAthlete t1 named Anirudh who is 18,
        TeamAthlete t1 = new TeamAthlete("Anirudh", 18, "Fremd", "Track");
        //      team is Fremd, sport is Track
        // print out the name and age for t1
        System.out.println( t1.getName() +" " +  t1.getAge() );
        // change the name and sport for t1 to be
//       Unc and Cross Country
        t1.setName("Unc");
        t1.setSport("Cross Country");
        // print out ALL variable values for t1
        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        System.out.println(t1.getTeamName());
        System.out.println(t1.getSport());
    }

}
