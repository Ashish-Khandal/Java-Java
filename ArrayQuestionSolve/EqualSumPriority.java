package ArrayQuestionSolve;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSumPriority {
    static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static boolean findEqualSumMethod(int[] arr) {
//        int[] newArr = new int[arr.length];
        int totalSum = arraySum(arr);
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum) {
                return true;
            }
        }
        return false;
    }

    public static void printArray(int[] arr, int x, int y) {
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
        findEqualSumMethod(arr);

    }
}
