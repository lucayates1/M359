package U9.Notes_9_5;

/**
* Lesson 9-5: Polymorphism
 * The purpose of this tester class is to see what happens when an array
 * of Animal references is assigned objects of type Animal, Pig, and Cow
 * 
 * @author   Mrs. Denna 
 */
public class AnimalTester
{
   public static void main(String[] args)
   {
       Animal[] barn = new Animal[6];
       // 1. What data type does this array hold?
        //subclasses of animal

       barn[0] = new Animal("Murphy");
       barn[1] = new Cow("Daisy", "Dairy");
       barn[2] = new Pig("Wilbur", false);
       barn[3] = new Cow("Billy", "Beef");
       barn[4] = new Animal("Maggie");
       barn[5] = new Pig("Max", true);

       // 2. Did I ONLY store Animal objects in this array?  If not, why do you
       //    think this was allowed?
        // no you also stores cow objects and pig objects which are subclasses of the superclass animal
       for (Animal a: barn)
            a.speak();
            // 3. What method is getting called here?  The speak method of the Animal class?
            // the speak method of the whatever class the specific animal is
       // 4. Try to summarize in 2-3 sentences WHAT you observed in this code.
       //this code takes an array of animals called barn and makes each one of them "speak" or make the sound
       //that the specific  animal makes. the super class animal has its own speak method which just prints the  name and says it makes a sound
       // but the subclasses cow and pig each have their own speak method that prints the sound that that specific animal makes.
   }
   
}
