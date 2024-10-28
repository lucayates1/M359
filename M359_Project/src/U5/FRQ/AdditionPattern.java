package U5.FRQ;

public class AdditionPattern{

    private int startingNum;
    private int addingNum;
    private int currNum;
    private int count = 0;





    public AdditionPattern(int startingNum, int addingNum){
        this.startingNum = startingNum;
        this.addingNum = addingNum;
    }


    public int currentNumber(){
        return currNum;
    }

    public void next(){
        if(count == 0){
            currNum = startingNum + addingNum;
        }
        else{
            currNum = currNum + addingNum;
        }
        count++;
    }

    public void prev(){
        if(count > 0){
            currNum = currNum - addingNum;
            count--;
        }
    }

}