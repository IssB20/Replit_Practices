package Replit_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Replit117_Printing_02 {
    public static void main(String[] args) {

/*
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i = 0; i < 8; i++) {
           arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 8 items
        //and print two items at a time in 4 line
        //write your code below


 */
        String [] arr = {"banana","kiwi","milk","coffee","juice","salt","sugar","tea"};
        //int i = 0;

        for (int i = 0; i <= arr.length - 1; i += 2) {

            String str = arr[i] + " , " + arr[i + 1];

            System.out.println(str);
        }

        System.out.println("=======================================");
     // Scanner scan = new Scanner(System.in);
       // String word = scan.next();
        int countOfDogs =0;
        int countOfCats = 0;
        String word = "CatjavacatcatdogDogdog";
               word = word.toLowerCase();
        System.out.println(word);
        String str = "";
        String cat ="";

       /* for( int i = 0 ; i <= word.length()-1; i++){
            String  ch = ""+word.charAt(i);

            if(ch.equalsIgnoreCase("c")) {
                if (word.substring(i, (i + 3)).equalsIgnoreCase("cat")) {
                    countOfCats++;
                }
            }else if(ch.equalsIgnoreCase("d")){
                if (word.substring(i,(i+3)).equalsIgnoreCase("dog")){
                    countOfDogs ++;
                }
            }
        }


        */

        for(int i = 0 ; i< word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'c') {
                if (word.substring(i, (i + 3)).equalsIgnoreCase("cat")) {
                    countOfCats++;
                }
            }else if (ch=='d'){
                if(word.substring(i,(i+3)).equalsIgnoreCase("dog")){
                    countOfDogs++;
                }
            }
        }
        System.out.println(str);

        System.out.println(countOfCats);
        System.out.println(countOfDogs);
        System.out.println(countOfCats==countOfDogs);


    }
}












