package ReplitRawSum;

import java.util.Arrays;

public class RowSum{

    public static void main(String[] args) {


        int[][] a = {{1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };

        System.out.println(  Arrays.toString(rowSum(a)) );
    }

    public static int[] rowSum(int [][]nums){
      //int sum = 0;

      int [] sum = new int [nums.length];

         //sum[0]= nums[0][1]+nums[0][2]+nums[0][3];
      for (int k =0 ; k< nums.length; k++) {
          for (int i = 0; i < nums[k].length; i++) {
              sum[i] = nums[k][i];
          }
      }
     return sum;
    }
}










