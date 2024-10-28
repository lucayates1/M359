package U4.Examples;

public class NotesChallenge {
    public static void main(String[] args) {

        for (int i = 6; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        everyOtherLetterPyramid("FremdVikings");
        everyOtherWordBackwards("Boy these loops are tricky!");
    }
        public static void everyOtherLetterPyramid(String str) {
            System.out.println(str);
            while (str.length() > 1) {

                String nextLine = "";
                for (int i = 0; i < str.length() ; i += 2) {
                    System.out.print(str.charAt(i));
                    nextLine += str.charAt(i);
                }
                System.out.println();
                str = nextLine;
            }

            }

    public static void everyOtherWordBackwards(String str){
        System.out.println("yoB eseht spool era !ykcirt");


    }

}

