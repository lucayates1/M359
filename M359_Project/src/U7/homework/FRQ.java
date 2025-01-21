package U7.homework;

public class FRQ {



    public static String screambleWord(String word){
        int index = 0;
        String output = "";
        for(int i = 0; i < word.length() -1; i++){
            if(word.length() > 1){
                if(word.charAt(i) == 'A' && word.charAt(i + 1) != 'A'){
                    output += word.charAt(i+1);
                    output += word.charAt(i);
                    i++;
                }
                else{
                    output += word.charAt(i);

                }
            }
        }
       output += word.charAt(word.length()-1);
        
        if(word.length() == 1){
            output = word;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(screambleWord("TAN"));
        System.out.println(screambleWord("ABRACADABRA"));
        System.out.println(screambleWord("WHOA"));
        System.out.println(screambleWord("AARDVARK"));
        System.out.println(screambleWord("EGGS"));
        System.out.println(screambleWord("A"));
    }
}