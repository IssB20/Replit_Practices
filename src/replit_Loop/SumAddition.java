package replit_Loop;

import java.util.Scanner;

public class SumAddition {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int sum = 0;

       /* for(int i = 1; i<=n; i++){
           // sum += i;
        }
        System.out.println(sum);

        */
        System.out.println("==============");

        int i =1;
        while (i<=n){
            sum+=i;
         i++;
        }
        System.out.println(sum);
    }
}
