package Array_concept;

import java.util.Scanner;

public class Array_max_element {
    public static void main(String[] args) {
        //! find maximum element in a array.
        // int[] arr = {10,20,60,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size:-");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter your array elements:-");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max element in array:- "+max);
    }
}
