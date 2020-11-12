package Replit_email;

import java.util.Scanner;

public class email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = scan.next();

        String firstName ="";
        String lastName = "";
        String domain = "";
        String level  = "";

        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");
        int indexOfDot = email.indexOf(".");

        // for(int i =0; i<=email.length()-1; i++){

        firstName = email.substring(0,indexOf_);

        lastName = email.substring(indexOf_+1,indexOfAt);

        domain = email.substring(indexOfAt+1,indexOfDot);

        level = email.substring(indexOfDot+1);

         String s1 ="";
         String s2 ="";

           s1 = firstName.substring(0,1).toUpperCase();
         firstName = firstName.replace(""+firstName.charAt(0),""+s1);

           s2   = lastName.substring(0,1).toUpperCase();
         lastName = lastName.replace(""+lastName.charAt(0),""+s2);

         System.out.println(s1);
         System.out.println(s2);

         System.out.println("First name: "+firstName);
         System.out.println("Last name: "+lastName);
         System.out.println("Domain: "+domain);
         System.out.println("Top-Level Domain: "+level);




    }
}
