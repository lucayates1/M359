package U3.Examples;

public class StepTracker{
    private int minSteps;
    private boolean active;
    private int steps;
    private int activeDays;
    private int days;

    public StepTracker(int m){
        minSteps = m;
        active = false;
        steps = 0;
        days = 0;
        activeDays = 0;
    }

    public void addDailySteps(int s) {
        if (s >= minSteps) {
            activeDays++;
        }
        steps += s;
        days++;

    }

    public double averageSteps(){
        return (double) steps / days;
    }

    public int activeDays(){
        return activeDays;
    }

}