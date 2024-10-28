package U5.FRQ;

public class HiddenWord{
    private String word;


    public HiddenWord(String word){

        this.word = word;

    }

    public String getHint(String guess){
        String answer = word;
        int length = word.length();
        String output = "";

        for(int i = 0; i < length; i++){
            if(guess.charAt(i) == answer.charAt(i)){
                output += word.substring(i, i +1);
            }
            else if(word.contains(guess.substring(i,i+1))){
                output += "+";
            }
            else{
                output += "*";
            }

        }
        return output;

    }







}
