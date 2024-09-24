package U3.Examples;

import org.w3c.dom.ls.LSOutput;

public class stepTester {
    public static void main(String[] args) {

        StepTracker tr = new StepTracker(10000);
        tr.addDailySteps(11000);
        System.out.println(tr.activeDays());

    }

}
