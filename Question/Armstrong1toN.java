package Question;

import java.util.Scanner;
public class Armstrong1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number range:- ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int x = i;
            while (x != 0) {
                if (x < 100) {
                    int r = x % 10;
                    sum = sum + r * r;
                    x = x / 10;
                    if (i == sum) {
                        System.out.print(i + " ");
                    }
                } else if (x < 1000) {
                    int r = x % 10;
                    sum = sum + r * r * r;
                    x = x / 10;
                    if (i == sum) {
                        System.out.print(i + " ");
                    }
                } else {
                    int r = x % 10;
                    sum = sum + r * r * r * r;
                    x = x / 10;
                    if (i == sum) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }
}
