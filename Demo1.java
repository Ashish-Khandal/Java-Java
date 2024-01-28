import java.util.Scanner;

public class Demo1 {
    /*5 4 3 2 1 2 3 4 5
        4 3 2 1 2 3 4
          3 2 1 2 3
            2 1 2
              1   */
    /* 23 10 84 95 10 15 10 9 8 10 */
    public static void main(String[] args) {
        int[] arr = {23, 10, 84, 95, 10, 15, 10, 9, 8, 10};

        /*for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 10) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
        /*int t = 0, x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10) {
                arr[t] = arr[i];
                t++;
            } else {
                x++;
            }
        }
        for (int i = arr.length-1; i >= arr.length-x; i--) {
            arr[i] = 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        int y = n * 2 + 5;
        while (n > 0) {
            for (int i = 5; i <= y; i++) {
                if (i % 2 != 0) {
                    x += i;
                    System.out.print(x + " ");
                    n--;
                }
            }
        }
    }
}