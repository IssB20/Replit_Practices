package RowSum;

import java.util.Arrays;

public class ReplitRowSum {
    public static void main(String[] args) {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        int [] sum = new int[a.length];

        for (int k =0 ; k < a.length ;k++) {
            for (int i = 0; i < a[k].length; i++) {
                sum[k] += a[k][i];
            }
        }

        System.out.println(Arrays.toString(sum));



    }

    public static int[] rowSums(int[][] nums){
        int [] sum = new int[nums.length];

        for (int i = 0; i < nums[0].length; i++){
            sum[i] += nums[0][i];
        }
       return sum;
    }
}
