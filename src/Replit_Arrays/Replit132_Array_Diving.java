package Replit_Arrays;

import java.util.Scanner;

public class Replit132_Array_Diving {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        //float [] score = { 1,5,5,5,5,8,9};


        for ( int i =0 ; i <=6; i++){
            System.out.println("Enter score for judge "+(i+1)+":");
            score[i]= input.nextFloat();
        }

        /*
        System.out.println("Enter score for judge 1:");
         score[0] = input.nextFloat();
        System.out.println("Enter score for judge 2:");
        score[1] =input.nextFloat();
        System.out.println("Enter score for judge 3:");
        score[2] =input.nextFloat();
        System.out.println("Enter score for judge 4:");
        score[3] =input.nextFloat();
        System.out.println("Enter score for judge 5:");
        score[4] =input.nextFloat();
        System.out.println("Enter score for judge 6:");
        score[5] =input.nextFloat();
        System.out.println("Enter score for judge 7:");
        score[6] =input.nextFloat();
         */


        System.out.println("Enter difficulty:");
        float degree = input.nextFloat();

        float maxScore = score[0];
        float minScore = score[0];
        float total = 0;

        for(float each : score){
            if (each>maxScore){
                maxScore = each;
            }
            if (each<minScore){
                minScore = each;
            }
        }

        for(float each: score){
            total+=each;
        }

        total -= (minScore+maxScore);
        System.out.println(total);




        total*=degree;
        System.out.println(total);
        total*=0.6;
        System.out.println(total);




        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);








    }
}

