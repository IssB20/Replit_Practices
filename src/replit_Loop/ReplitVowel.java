package replit_Loop;

import java.util.Scanner;

public class ReplitVowel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("In:");
        String word = inp.nextLine();

        //write your code below

        int length = word.length();




        String result="";

        for ( int i = 0 ; i <= length-1; i+=1){
            char ch = word.charAt(i);
            if (ch==('a')|| ch =='e' || ch =='i'|| ch =='o'|| ch=='u'){
                result += ch;

            }
        }

        System.out.println(result);
    }
}
