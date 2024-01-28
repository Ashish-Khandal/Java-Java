package ArrayQuestionSolve;

import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangleTwoDArray {
    public static void pascalTriangle(int n) {
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = arr[i][i] = 1;
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        printArray(arr);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] elements : array) {
            System.out.println(Arrays.toString(elements));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your pascal triangle length:- ");
        int n = sc.nextInt();
        pascalTriangle(n);
    }
}

