package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main ( String[] args ) {

        Map<Integer,String> map = new HashMap <Integer, String>();
        map.put(100,"Lallu Lal");
        map.put(102, "Magan Lala");
        map.put(103, "Lasan Lala");
        map.put(104, "Chaman Jingoor");

        for (Map.Entry<Integer, String> m : map.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }
        System.out.println(map.get(102));

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.remove(103));
        map.clear();
        System.out.println(map);
    }
}
