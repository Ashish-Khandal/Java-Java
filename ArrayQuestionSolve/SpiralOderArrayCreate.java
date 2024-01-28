package ArrayQuestionSolve;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralOderArrayCreate {
    public static void printSpiralArray(int n) {
        int[][] arr = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int current = 1;
        while (current <= n * n) {
            for (int j = leftCol; j <= rightCol && current <= n * n; j++) {
                arr[topRow][j] = current++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                arr[i][rightCol] = current++;
            }
            rightCol--;
            for (int j = rightCol; j >= leftCol && current <= n * n; j--) {
                arr[bottomRow][j] = current++;
            }
            bottomRow--;
            for (int i = bottomRow; i >= topRow && current <= n * n; i--) {
                arr[i][leftCol] = current++;
            }
            leftCol++;
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
        System.out.print("Enter your Array length:- ");
        int n = sc.nextInt();
        printSpiralArray(n);
    }
}
