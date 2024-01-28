package ArrayQuestionSolve;

import java.util.Scanner;

public class PrifixSumArray {
    public static int[] sumArray(int[] arr) {
        int i = 0;
        int sum = 0;
        while (i <= arr.length - 1) {
            sum += arr[i];
            arr[i] = sum;
            i++;
        }
        return arr;
    }

    public static void printArray(int[] arr, int x, int y) {
        for (int i = x - 1; i <= y - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
        System.out.print("Enter your query number when you are iteration in array :- ");
        int q = sc.nextInt();
        int i = 1;
        sumArray(arr);
        while (i <= q) {
            System.out.println("Enter your rang when you are add numbers :- ");
            int x = sc.nextInt();
            System.out.println("to");
            int y = sc.nextInt();
            printArray(arr, x, y);
            i++;
        }
    }
}

