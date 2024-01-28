package ArrayQuestionSolve;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeArray {
    public static void transposeArray(int[][] arr, int row, int col) {
        int[][] transposeArray = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transposeArray[i][j] = arr[j][i];
            }
        }
        printArray(transposeArray);
    }

    //! without new array create (only square matrix)
    public static void transposeArraySecondMethod(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
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
        System.out.print("Enter your array row size:- ");
        int row = sc.nextInt();
        System.out.print("Enter your array column size:- ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter your array element:- ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        transposeArray(arr, row, col);
//        transposeArraySecondMethod(arr,row,col);
    }
}
