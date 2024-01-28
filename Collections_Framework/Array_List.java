package Collections_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Array_List {
    public static void main(String[] args) {

//!     Un type safe list:-
        List l1 = new ArrayList();
        l1.add(100);
        l1.add(10.56);
        l1.add("Surya");
        l1.add(true);
        System.out.println(l1);

//!     Type safe list:-
        ArrayList<String> str = new ArrayList<>();
        str.add("Ashish");
        str.add("Surya");
        str.add("Sudarshan");
        System.out.println(str);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        list.add(50);
        System.out.println(list);


        list.add(0, 5);
        System.out.println(list);


        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(60);
        newList.add(70);
        System.out.println(newList);


        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(0);
        System.out.println(list);
        list.remove(Integer.valueOf(70));
        System.out.println(list);

      /*  list.clear();
        System.out.println(list);*/

        list.set(5, 70);
        System.out.println(list);
        //? Contains method find value in the list (true and false)
        System.out.println(list.contains(60));

//!     First Method
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

//!     Second Method
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

//!     Third Method
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        //? Backward traversal :-
        ListIterator<Integer> li = list.listIterator(list.size());
        while (li.hasPrevious()) {
            System.out.print(li.previous() + " ");
        }
        System.out.println();

//!     Fourth Method
        //? Use lambda function
        list.forEach(e -> {
            System.out.print(e + " ");
        });
    }
}
