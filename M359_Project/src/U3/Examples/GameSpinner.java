package U3.Examples;

public class GameSpinner {
    private int secters;
    private int runs = 0;
    private int lastSpin;
    private int firstSpin;

    public GameSpinner(int s){
        secters = s;
    }

    public int spin(){
        firstSpin = (int)(Math.random() * secters + 1);

	if(firstSpin == lastSpin){
        runs++;
    }
	else{
        runs = 0;
    }
    firstSpin = lastSpin;
	return firstSpin;
}

public int currentRun(){
    return runs;

}
}