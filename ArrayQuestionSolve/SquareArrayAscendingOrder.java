package ArrayQuestionSolve;

import java.util.Arrays;
import java.util.Scanner;

public class SquareArrayAscendingOrder {
    public static int[] arraySquareLogic(int[] arr) {
        int[] newArr = new int[arr.length];
        int x = 0;
        int y = arr.length - 1;
        int k = arr.length-1;
        //? Always input array in non-decreasing order.
        //! Example -> -7 -5 -3 -2 1 2 3 5 8 9
        while (x <= y) {
            if (Math.abs(arr[x]) > Math.abs(arr[y])) {
                newArr[k] = arr[x] * arr[x];
                x++;
                k--;
            } else {
                newArr[k] = arr[y] * arr[y];
                y--;
                k--;
            }

        }
        return newArr;
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
        int[] newArr = arraySquareLogic(arr);
        arraySquareLogic(newArr);
        printArray(newArr);
    }
}
