package Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass_learn {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(43);
        list.add(97);
        list.add(87);
        list.add(43);
        list.add(47);
        list.add(6);
        list.add(43);
        System.out.println("Minimum element:- "+Collections.min(list));
        System.out.println("Maximum element:- "+Collections.max(list));
        System.out.println("List frequency:- "+Collections.frequency(list,43));

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
