public class first1 {
    public static void main(String[] args) {
         /*
      5 4 3 2 1 2 3 4 5
        4 3 2 1 2 3 4
          3 2 1 2 3
            2 1 2
              1
              */
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}