package SwitchElementArray;

import java.util.Arrays;

public class DoSwitch {
    public static void main(String[] args) {


        int [] arr1 = {1,2,3,4};

        // arr2[] = {4,2,3,1} switch 1 and 4
     //   int []arr2 = new int [arr1.length];

       // arr2[0] = arr1[arr1.length-1];

        int temp = arr1[arr1.length-1];
        arr1[arr1.length-1]= arr1[0];
        arr1[0] = temp;

        System.out.println(Arrays.toString(arr1));



    }
}
