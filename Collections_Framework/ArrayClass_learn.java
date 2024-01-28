package Collections_Framework;

import java.util.Arrays;

public class ArrayClass_learn {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(arr, 4);
        System.out.println("Array present in index:- " + index);

        int[] arr2 = {34, 234, 754, 65, 98, 35, 89, 83, 551};
        Arrays.sort(arr2);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.parallelSort(arr2); //? Long value Sorting
        for(int i: arr2){
            System.out.print(i+" ");
        }
        System.out.println();

        Arrays.fill(arr,11);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
