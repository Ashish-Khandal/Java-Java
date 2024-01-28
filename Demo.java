import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void gcd(int x, int y) {
        for (int i = x; i > 0; i--) {
            if (x % i == 0 && y % i == 0) {
                System.out.println(i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 48, 10, 10, 48, 36, 10};
        for (int j = 0; j <= arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 10) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
