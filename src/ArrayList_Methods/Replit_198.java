package ArrayList_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_198 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("hi","ki","ok"));
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("lol","oo"));

        System.out.println(combineAl(list1,list2));




    }

    //create your method below
    public static ArrayList<String> combineAl(ArrayList<String> worldList1, ArrayList<String> worldList2){

        ArrayList<String> result = new ArrayList<>();

        for(String each : worldList1){
            result.add(each);
        }
        for(String each : worldList2){
            result.add(each);
        }

        return result;
    }
}
