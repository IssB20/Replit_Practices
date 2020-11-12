package replit_Loop;

import java.util.Scanner;

public class WithoutX_x {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length = word.length();

        boolean start = word.startsWith("x") || word.startsWith("X");
        boolean end   = word.endsWith("X") || word.endsWith("X");

        String result ="";

        for(int i =0 ; i<= length-1 ; i++){
            char ch = word.charAt(i);

            if( start && end)  {
                continue;

            }
              result+= ch;
        }

        System.out.println(result);





    }
}
