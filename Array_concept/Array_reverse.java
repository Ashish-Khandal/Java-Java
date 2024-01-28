package Array_concept;

import java.util.Scanner;

public class Array_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size:- ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter your array elements:-");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        //! first method
        /*
        for (int i = 0; i < size / 2; i++) {
            int firstValue = arr[i];
            int lastValue = arr[size - i - 1];
            arr[i] = lastValue;
            arr[size - i - 1] = firstValue;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }*/
        //! Second method
        int i = 0;
        int x = arr.length - 1;
        while (i < x) {
            //? swap
            int temp = arr[i];
            arr[i] = arr[x];
            arr[x] = temp;
            i++;
            x--;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
