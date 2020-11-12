package String_Methods_Practices;

import java.util.Scanner;



    public class Practice1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

        /*
        write a program that ask user to enter a sentence
        then print out the first and last characters
         */
            System.out.println("Enter your sentence here: ");
            //Java class is realy fun, I am very excited to learn how to code!
            String sentence = scan.nextLine();

            int l = sentence.length() - 1;
            int lastIndex = sentence.length();
            char firstChar = sentence.charAt(0);
            char lastChar = sentence.charAt(l);
            ;
            System.out.println(l);
            System.out.println(lastIndex);

            System.out.println("Your first character is: " + firstChar);
            System.out.println("Your last chatacter is: " + lastChar);


        }
    }