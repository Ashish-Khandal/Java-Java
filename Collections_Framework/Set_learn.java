package Collections_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_learn {
    public static void main(String[] args) {
        System.out.println("        *** First Set ***        ");
        Set<Integer> set = new HashSet<>();//! Time complexity O(N).
//        Set<Integer> set2 = new LinkedHashSet<>();
        // ! TreeSet provide sorted elements and time complexity:- O(log n).
        //  Set<Integer> set3 = new TreeSet<>();
        set.add(78);
        set.add(56);
        set.add(69);
        set.add(85);
        set.add(23);
        set.add(45);
        //! Set can't add duplicate value
        set.add(56);
        System.out.println(set);//! Random output in a set.

        set.remove(45);
        System.out.println(set);

        System.out.println(set.contains(23));

        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set + "\n");

// !  If we are follow the sequence than use LinkedHashSet and use same property.
        System.out.println("        *** Second Set ***        ");
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(78);
        set2.add(56);
        set2.add(69);
        set2.add(85);
        set2.add(23);
        set2.add(45);
        //! Set can't add duplicate value
        set2.add(56);
        System.out.println(set2 + "\n");//! Not random output only Sequence output.

        System.out.println("        *** Third Set ***        ");
        //! This set provide Sorted set.
        Set<Integer> set3 = new TreeSet<>();
        set3.add(78);
        set3.add(56);
        set3.add(69);
        set3.add(85);
        set3.add(23);
        set3.add(45);
        //! Set can't add duplicate value
        set3.add(56);
        System.out.println(set3);

//!     Iteration values:-
        set3.forEach(e->{
            System.out.print(e+" ");
        });
    }
}
