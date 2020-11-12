package Replit_email;

import java.util.Scanner;

public class email1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int index_ = email.indexOf("_");
        //int index0 = email.indexOf(email.charAt(0));
        int indexAt = email.indexOf("@");

       if(email.contains("_")){

           System.out.println(email.substring(index_+1,indexAt)+"_"+email.substring(0,index_)+
               email.substring(indexAt));

        }else {
           System.out.println(email);
       }



    }
}
