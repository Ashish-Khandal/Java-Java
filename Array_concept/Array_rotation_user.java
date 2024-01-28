package Array_concept;

import java.util.Arrays;
import java.util.Scanner;

public class Array_rotation_user {
    public static void reverseMethod(int[] arr, int beg, int end) {
        while (beg < end) {
            int copy = arr[beg];
            arr[beg] = arr[end];
            arr[end] = copy;
            beg++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.print("Enter your size:- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter your array elements:- ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a value you are N time rotate:- ");
        int n = sc.nextInt();

        //! First method
        /*n = n % size;
        int x = 1;
        while (x <= n) {
            temp = arr[0];
            for (int i = 1; i < size; i++) {
                arr[i - 1] = arr[i];
            }
            x++;
            arr[size - 1] = temp;
        }
        System.out.println("Left rotation " + n + " time Output-->");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }*/

//        ! Second method
     /*   int x = 0;
        n = n % size;
        int[] newArr = new int[size];
        for (int i = size - n; i <= size - 1; i++) {
            newArr[x++] = arr[i];
        }
        for (int i = 0; i < size - n; i++) {
            newArr[x++] = arr[i];
        }
        System.out.print(Arrays.toString(newArr));*/

//        ! Third method
        n = n % size;
        reverseMethod(arr, 0, (size - 1) - n);//? this method reverse only last element.
        reverseMethod(arr, size - n, size - 1);//? this method reverse only stating elements.
        reverseMethod(arr, 0, size - 1);//? this method reverse total elements in an array.
        System.out.println(Arrays.toString(arr));
    }
}
