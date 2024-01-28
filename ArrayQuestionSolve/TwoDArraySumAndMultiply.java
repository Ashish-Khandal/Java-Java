package ArrayQuestionSolve;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraySumAndMultiply {
    public static void twoDArraySum(int[][] arr, int[][] arr2, int row, int col, int row2, int col2) {
        int[][] sumArray = new int[row][col];
        if (row == row2 || col == col2) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    sumArray[i][j] = arr[i][j] + arr2[i][j];
                }
            }
        } else {
            System.out.println("Your arrays are wrong.");
        }
        printArray(sumArray);
    }

    public static void twoDArrayMultiply(int[][] arr, int[][] arr2, int row, int col, int row2, int col2) {
//?        int[][] multiplyArray = new int[col][col];
        int[][] multiplyArray = new int[row][col2];
        if (col != row2) {
            System.out.println("input array wrong.");
            return;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col; k++) {
                    multiplyArray[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        printArray(multiplyArray);
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
        System.out.print("Enter your array row size:- ");
        int row = sc.nextInt();
        System.out.print("Enter your array column size:- ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter your array element:- ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter your next array row size:- ");
        int row2 = sc.nextInt();
        System.out.print("Enter your next array column size:- ");
        int col2 = sc.nextInt();
        int[][] arr2 = new int[row2][col2];
        System.out.println("Enter your next array element:- ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of both arrays : ");
        twoDArraySum(arr, arr2, row, col, row2, col2);
        System.out.println("Multiply of both arrays : ");
        twoDArrayMultiply(arr, arr2, row, col, row2, col2);
    }
}
