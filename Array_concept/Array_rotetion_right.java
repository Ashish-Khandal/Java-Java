package Array_concept;

import java.util.Scanner;

public class Array_rotetion_right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.print("Enter your size:-");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter your array elements:-");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        temp = arr[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
        System.out.println("Right rotation Output-->");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
