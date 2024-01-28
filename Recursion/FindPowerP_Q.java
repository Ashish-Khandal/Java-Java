package Recursion;

public class FindPowerP_Q {
    //    ! Method first.
    public static int powerFind(int p, int q) {
        if (q == 0) {
            return 1;
        }
        return p * powerFind(p, q - 1);
    }

    //    ! Method Second.
    public static int powerFind2(int p, int q) {
        if (q == 0) {
            return 1;
        }
        int smallPow = powerFind2(p, q / 2);
        if (q % 2 == 0) {
            return smallPow * smallPow;
        }
        return smallPow * smallPow * p;
    }


    public static void main(String[] args) {
        System.out.println(powerFind(2, 3));
        System.out.println(powerFind2(2, 4));
    }
}
