package Array_concept;

import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array rows size:- ");
        int rows = sc.nextInt();
        System.out.print("Enter your columns size:- ");
        int columns = sc.nextInt();
        int [][] arr = new int[rows][columns];
        System.out.println("Enter your array numbers:- ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println("next->");
        }
        System.out.println("Your array are :- ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
