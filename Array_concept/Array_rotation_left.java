package Array_concept;

import java.util.Scanner;

public class Array_rotation_left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.print("Enter your size:-");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter your array elements:-");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        temp = arr[0];
        for(int i=1; i<size; i++){
            arr[i-1]=arr[i];
        }
        arr[size-1]=temp;
        System.out.println("Left rotation Output-->");
        for(int i=0; i<size; i++){
        System.out.print(arr[i]+" ");
        }
    }
}
