package Replit_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Replit122_NonDup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        System.out.println(Arrays.toString(nums));



       for (int a : nums) {
           int count = 0;
           for (int each : nums) {
               if (each == a) {
                   count++;
               }
           }
           if (count == 1) {
               System.out.println(a);
           }

       }



    }
}
