package Collections_Framework.Questions;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List_BasicQuestion {
    //    ! First method.
    public static void arrayListReverse(ArrayList<Integer> arrayList) {
        int i = 0;
        int j = arrayList.size() - 1;
//        ArrayList<Integer> list = new ArrayList<>();
        while (i < j) {
            Integer temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(j));
            arrayList.set(j, temp);
            i++;
            j--;
        }
        System.out.println("Reverse Order:-"+arrayList);
    }

    //    ! Second method.
    public static void arrayListReverse2(ArrayList<Integer> arrayList) {
        Collections.reverse(arrayList);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(20);
        arrList.add(10);
        arrList.add(70);
        arrList.add(50);
        arrList.add(40);
        arrList.add(30);
        arrList.add(60);
        System.out.println(arrList);
        arrayListReverse(arrList);
        arrayListReverse2(arrList);


//        ? Increasing order.
        Collections.sort(arrList);
        System.out.println("Increasing Order : "+arrList);
//        ? decreasing order.
        Collections.sort(arrList, Collections.reverseOrder());
        System.out.println("Decreasing Order : "+arrList);
    }
}
