package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main ( String[] args ) {
        List<String> list = new ArrayList <String>();
        list.add("King");
        list.add("Chaman");
        list.add("Chandu");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(0);

        for(String value : list){
            System.out.println(value);
        }
    }
}
