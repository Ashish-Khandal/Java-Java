package Question;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.print("Enter your decimal number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int logic = 0;
        int count = 1;
        while (n > 0) {
            int x = n % 10;
            logic += (x * count);
            n = n / 10;
            count = count * 2;
        }
        System.out.print(logic);
    }
}
