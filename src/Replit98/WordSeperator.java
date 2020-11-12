package Replit98;

public class WordSeperator {
    public static void main(String[] args) {
        /*
        Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
Example:
input: Word
input: X
input: 3
output: WordXWordXWord

Example:
input: This
input: And
input: 2
output: ThisAndThis

Example:
input: This
input: And
input: 1
output: This
         */

        String word = "word";
        String sep = "x";
        int count = 1;
        // output: WordXWordXWord

        for(int i =1 ; i < count; i+=1){
            System.out.print(word+sep);
            //System.out.print(word);
        }
        System.out.println(word);



    }
}
