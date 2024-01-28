package ArrayQuestionSolve;

import java.util.Arrays;
import java.util.Scanner;
public class SmallAndLargeElement {
    public static int[] smallAndLargeElementMethod(int[] arr, int x, int y) {
        Arrays.sort(arr);
        System.out.println("Your sorted array is :- "+Arrays.toString(arr));
        int[] result = {arr[x-1], arr[arr.length - y]};
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your array element:- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter your smallest kth element number:- ");
        int x = sc.nextInt();
        System.out.print("Enter your largest kth element number:- ");
        int y = sc.nextInt();
        System.out.println(Arrays.toString(smallAndLargeElementMethod(arr, x, y)));
    }
}
