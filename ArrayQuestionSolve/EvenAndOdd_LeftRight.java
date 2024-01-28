package ArrayQuestionSolve;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOdd_LeftRight {
    //    ! First method.
    public static int[] evenAndOdd(int[] arr) {
        int[] newArr = new int[arr.length];
        int x = 0;
        int y = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[x] = arr[i];
                x++;
            } else {
                newArr[y--] = arr[i];
            }
        }
        return newArr;
    }

    //    ! Second method without new array create.
    public static int[] evenAndOddNew(int[] arr) {
        int x = 0;
        int y = arr.length - 1;
        while (x < y) {
            if (arr[x] % 2 == 1 && arr[y] % 2 == 0) {
                int temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
                x++;
                y--;
            }
            if (arr[x] % 2 == 0) {
                x++;
            }
            if (arr[y] % 2 == 1) {
                y--;
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size:- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter your array element:- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] newArr = evenAndOdd(arr);
        printArray(newArr);
        evenAndOddNew(arr);
        printArray(arr);
    }
}
