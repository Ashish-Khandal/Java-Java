package Array_concept;

import java.util.Arrays;
import java.util.Scanner;

public class ElementPresentInArray {
    public static int[] freqArray(int[] arr) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size:- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter your array element:- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = freqArray(arr);
        System.out.println("Enter your query:- ");
        int q = sc.nextInt();
        while (q>0){
            System.out.print("Enter number to be searching:- ");
            int x = sc.nextInt();
            if (freq[x]>0){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
            q--;
        }
    }
}
