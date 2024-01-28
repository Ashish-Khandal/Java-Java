package Sorting_in_java;

public class Bubble_Sort {
    public static void printArray(int arr[]) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        // int[] arr  = new int[]{7,8,3,1,2};

        //!  Time complexity = O(n^2) 

        int[] arr = {7, 8, 3, 1, 2, 4, 6, 5};
        //Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }
}
