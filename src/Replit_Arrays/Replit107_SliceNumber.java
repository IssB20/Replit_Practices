package Replit_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Replit107_SliceNumber {
    public static void main(String[] args) {

        int num, digit1, digit2, digit3, digit4, digit5;
    /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        String str2 = scan.next();
        String [] arrStr = str2.split("");
        System.out.println(Arrays.toString(arrStr));
    /*
        for (String each : arrStr){
            System.out.println(each);
        }


    /*
        String str = ""+num;

        String [] arr = new String [str.length()];

        for (int i =0 ; i < str.length(); i++){
            arr[i]= ""+str.charAt(i);
            System.out.println(arr[i]);
        }
        System.out.println("===========================================");
        System.out.println(Arrays.toString(arr));
        System.out.println(str);
        /*
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println("=========================");
        for (String each: arr){
            System.out.println(each);
        }
     */
    /*
        int input = scan.nextInt();

        int reverse = 0;
        int remainder = 0;

        while(input > 0){
            remainder = input%10;
            reverse = reverse*10 +remainder;
            input = input/10;
        }
        while(reverse>0){
            System.out.println(reverse%10);
            reverse = reverse/10;
        }
     */

        int number = 45636;


    /*
        digit1 = number /10000;  // 1
        number = number%10000; // 2345

        digit2 = number /1000; // 2
        number = number%1000 ;  // 345

        digit3 = number /100;   // 3
        number = number%100;    // 45

        digit4 = number /10;  // 4
        number  = number%10;   // 5
        digit5 = number%10;

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);

     */
        System.out.println("======================================");

     for (int i = 10000; i>0; i/=10){

            int digit = number/i;
             number = number%i;

         System.out.println(digit);
     }




    }
}
