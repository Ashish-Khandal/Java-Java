package Question;

import java.util.Scanner;

public class DecimalToBinary {
    public static <list> void main(String[] args) {
        //! First Method
      /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your binary number :- ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (n > 0) {
            int x = n % 2;
            list.add(x);
            n = n / 2;
            i++;
        }
        for (i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        */

        //! Second Method
        System.out.print("Enter your binary number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int logic = 0;
        int count = 1;
        while (n > 0) {
            int x = n % 2;
            logic += (x * count);
            count *= 10;
            n = n / 2;
        }
        System.out.print(logic);
    }
}
