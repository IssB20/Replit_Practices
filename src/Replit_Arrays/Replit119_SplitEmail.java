package Replit_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Replit119_SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = input.nextLine();

        //Write your code below

        String [] arr = email.split("@");
        System.out.println(Arrays.toString(arr));

        int n = arr.length;
        if(n !=2){
            System.out.println("Invalid email");
        }else {

            System.out.println("Email Id: " + arr[0]);
            System.out.println("Email domain: " + arr[1]);
        }






    }
}
