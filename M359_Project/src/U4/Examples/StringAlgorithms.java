package U4.Examples;

public class StringAlgorithms {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";
        String str = "";
        // print every other character of mySchool on the same line
        for(int i = 0; i < mySchool.length(); i += 2){
            str += mySchool.charAt(i);

        }
        System.out.println(str );

        // print the String mySchool in reverse (all characters on the same line)
        String strReverse = "";
        for(int i = mySchool.length() - 1; i >= 0; i--){
            strReverse += mySchool.substring(i, i + 1);

        }
        System.out.println(strReverse);



         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
        String animal = "monkey";
        for(int i = 0; i < animal.length(); i+= 2){
            System.out.println(animal.substring(0, i + 1));
        }





        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb. ";
        phrase += "Mary had a little lamb, its fleece was white as snow";
        int wordCount = 0;
        String word = "little";
        // Print the amount of times the word "little" appears within phrase?
        while(phrase.contains(word)){
          int index = phrase.indexOf(word);
               phrase = phrase.substring(0 , index) + phrase.substring(index + word.length(), phrase.length());
               wordCount++;
            }

        System.out.println("The word little " +  "appears in phrase"  + wordCount + " times");


        // create a new String, or modify the existing String, that removes
        // the word "little" entirely

        System.out.println("The new string is: \n\n" + phrase);



        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"
        phrase = "Mary had a little lamb, little lamb, little lamb. ";
        phrase += "Mary had a little lamb, its fleece was white as snow";
        while(phrase.contains(word)){
            int index = phrase.indexOf(word);
            phrase = phrase.substring(0 , index) + "BIG" + phrase.substring(index + word.length());

        }
        System.out.println("The new string is: \n\n " + phrase);

    }
}
