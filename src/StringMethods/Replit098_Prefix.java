package StringMethods;

import java.util.Scanner;

public class Replit098_Prefix {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
       // String str = scan.next();
       // int n = scan.nextInt();

        String str = "aXYabc";
        System.out.println(str.substring(0,1));

        int n=1;
        int count =0;

        for (int i =0 ; i< str.length(); i++) {
            if (str.substring(i).equals(str.substring(0,1))) {
                count++;
            }
        }
        System.out.println(count);
        if(count==2){
            System.out.println(count==2);
            System.out.println(" appears twice");
        } else if(count==1){
            System.out.println(count==2);
            System.out.println(" appears once only");
        }

    }
}
