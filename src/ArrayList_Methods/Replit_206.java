package ArrayList_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_206 {
    public static void main(String[] args) {
        ArrayList<Boolean> see = new ArrayList<>();
        see.addAll(Arrays.asList(false,true,false,true));
        repeatAL(see);

    }
    public static void repeatAL(ArrayList<Boolean> list){

        ArrayList<Boolean> repeatList = new ArrayList<>();

          repeatList.addAll(list);
          repeatList.addAll(list);
          
        System.out.println(repeatList);

    }
}
