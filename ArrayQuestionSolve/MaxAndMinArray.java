package ArrayQuestionSolve;

import java.util.*;

public class MaxAndMinArray {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:-");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your array element:-");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0], min = arr[0];
        for (int i = 1; i < n; i++) {
            if (max<arr[i]){
                max = arr[i];
            }else if(min>arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);*/

//!       ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        /*List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size:- ");
        int n = sc.nextInt();
        System.out.println("Enter your Array number:- ");
        for (int i = 0; i <n; i++) {
            int element = sc.nextInt();
            list.add(element);
        }
        Collections.sort(list);
        Deque<Integer> dq = new ArrayDeque<>(list);
        System.out.print("Your maximum element is:- " + dq.peekLast() + "\n");
        System.out.print("Your minimum element is:- " + dq.peekFirst());*/

//!       +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        Set<Integer> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size:- ");
        int n = sc.nextInt();
        System.out.println("Enter your Array number:- ");
        for (int i = 0; i <n; i++) {
            int element = sc.nextInt();
            set.add(element);
        }
        Deque<Integer> dq = new ArrayDeque<>(set);
        System.out.print("Your maximum element is:- " + dq.peekLast() + "\n");
        System.out.print("Your minimum element is:- " + dq.peekFirst());
    }
}
