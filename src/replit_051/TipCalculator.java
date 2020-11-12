package replit_051;
import java.util.*;
public class TipCalculator {
    public static void main(String[] args) {


        //WRITE YOUR CODE HERE

        Scanner scan = new Scanner(System.in);


        System.out.println("Split:");
        String split =scan.next();

       // if(split.equalsIgnoreCase("yes"))
        System.out.println("Number of people:");
        int  num = scan.nextInt();


        System.out.println("Check amount:");
        double check =scan.nextDouble();


        System.out.println("Service Quality:");
        String service = scan.next();
       int i = 1;
       char ch ='&';
       String people ="";

        while(ch =='&'){
            people +=ch;

          if(i>=num){

              break;
          }

        i++;
        }
        System.out.println("Number of people entered: " +people);

        double tip = 0;
        double total=0;
        //for(int i =1; i <=5; i++){
        if (service.equalsIgnoreCase("Excellent")){
             tip = check/100*25;

        }else if(service.equalsIgnoreCase("Great")){
             tip = check/100*20;

        }else if(service.equalsIgnoreCase("Good")){
             tip = check/100*15;

        }else if(service.equalsIgnoreCase("Fair")){
             tip = check/100*10;

        }else if(service.equalsIgnoreCase("Poor")){
             tip = check/100*5;

        }

         total = check+tip;

        System.out.println("Total to pay: "+total);

        System.out.println("Total tip: "+ tip);

        System.out.println("Total per person: "+(total/num));

        System.out.println("Tip per person: "+(tip/num));



    }
}






