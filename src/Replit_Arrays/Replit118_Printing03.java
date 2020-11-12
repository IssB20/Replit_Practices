package Replit_Arrays;

import java.util.Scanner;

public class Replit118_Printing03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 6 items
        //and print three neibouring items at a time till last item
        //write your code below

        for( int i =0 , k=1; i<4 ;  k++ ,i++){

            System.out.print(arr[i]+" , ");
            System.out.println(arr[k]+" , "+arr[k+1]);

        }


    }
}

