package route;

import java.util.Scanner;

public class routeFound {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String route ="";

        if(start.equals("A") && end.equals("B") ){
            route = "right: B found";

        }else if( start.equals("A") && end.equals("C")){
            route = "right > down: C found";

        }else if( start.equals("A") && end.equals("D")){
            route = "right > down > left: D found ";

        }else if( start.equals("A") && end.equals("A")){
            route = "A found";

        }else if(start.equals("B") && end.equals("C")){
            route = " down: C found ";

        }else if( start.equals("B") && end.equals("C")){
            route = "down > left: D found ";

        }else if( start.equals("B") && end.equals("A") ){
            route = "down > left > up: A found ";

        }else if( start.equals("B") &&  end.equals("B")){
            route = "B found ";

        }else if( start.equals("C") && end.equals("B") ){
            route = "left > up > right: B found ";

        }else if( start.equals("C") && end.equals("D") ){
            route = "left: D found ";

        }else if( start.equals("C") && end.equals("A")){
            route = "left > up: A found ";


        }else if( start.equals("C") &&end.equals("C")){
            route = "C found";

        }else if(start.equals("D") && end.equals("A") ){
            route = "up: A found ";

        }else if( start.equals("D") && end.equals("B") ){
            route = "up > right: B found ";

        }else if( start.equals("D") && end.equals("C") ){
            route = "up > right > down: C found ";

        }else if( start.equals("D") && end.equals("D") ){
            route = "D found";

        }



        System.out.println(route);








    }
}
