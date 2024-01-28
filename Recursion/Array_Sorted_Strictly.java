package Recursion;

public class Array_Sorted_Strictly {
    public static boolean find_sort_array(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return find_sort_array(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println(find_sort_array(arr, 0));
    }
}
