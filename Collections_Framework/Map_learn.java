package Collections_Framework;

import java.util.HashMap;
import java.util.Map;

public class Map_learn {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
//!        Map<Integer, String> mp = new TreeMap<>();
// !       TreeMap use always Sorting a key bases Map.
        mp.put(2, "Ashish");
        mp.put(1, "Surya");
        mp.put(4, "Sudarshan");
        mp.put(3, "Pandit");
        System.out.println(mp);


        //! If any condition we are use same key then value is overriding.
        mp.put(4, "Ram");
        System.out.println(mp);


        //! But fix the error:-
        if (!mp.containsKey(4)) {
            mp.put(4, "Shyam");
        }
// ?       System.out.println(mp);
        //! or
        mp.putIfAbsent(4, "Shyam");
//?        System.out.println(mp);

        //! Map key and value iteration:-
        for (Map.Entry<Integer, String> elements : mp.entrySet()) {
            System.out.println(elements);

            System.out.println(elements.getKey());
            System.out.println(elements.getValue());
        }
        for (Integer keyPrint : mp.keySet()) {
            System.out.println(keyPrint);
        }
        for (String valuePrint : mp.values()) {
            System.out.println(valuePrint);
        }
        System.out.println(mp.containsKey(2));
        System.out.println(mp.containsValue("Ram"));

        mp.remove(4);
        System.out.println(mp);

        //!     Iteration keys and values help for lambda function :-
        mp.forEach((e1,e2)->{
            System.out.print(e1+":-"+e2+" ");
        });
    }
}
