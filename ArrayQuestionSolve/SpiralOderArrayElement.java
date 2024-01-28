package ArrayQuestionSolve;

import java.util.Scanner;

public class SpiralOderArrayElement {

    public static void printSpiral(int[][] arr, int row, int col) {
        int topRow = 0, bottomRow = row - 1, leftCol = 0, rightCol = col - 1;
        int totalElement = 0;
        while (totalElement < row * col) {
            for (int j = leftCol; j <= rightCol && totalElement < row * col; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElement++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && totalElement < row * col; i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;
            for (int j = rightCol; j >= leftCol && totalElement < row * col; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;
            for (int i = bottomRow; i >= topRow && totalElement < row * col; i--) {
                System.out.print(arr[i][leftCol] + " ");
                totalElement++;
            }
            leftCol++;
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
        printSpiral(arr, row, col);
    }
}

