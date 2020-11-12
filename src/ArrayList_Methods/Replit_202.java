package ArrayList_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_202 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList( 1,2,3,4,5));
        timesTwo(num);


    }
    public static void timesTwo(ArrayList<Integer> nums){

        for( int i =0; i<=nums.size()-1;i++ ){
            nums.set(i,nums.get(i)*2);
        }

        System.out.println(nums);
    }
}
