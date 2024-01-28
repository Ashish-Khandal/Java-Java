package Recursion;

public class Move_x_InLast {
    static String newString = "";

    public static void lastMove(int idx, String str, int count, char cr) {
        if (str.length() == idx) {
            for (int i = 1; i <= count; i++) {
                newString += cr;
            }
            System.out.println(newString);
            return;
        }
        if (str.charAt(idx) == cr) {
//            count = count + 1;
            lastMove(idx + 1, str, count + 1, cr);
        } else {
            newString += str.charAt(idx);
            lastMove(idx + 1, str, count, cr);
        }
    }

    public static void main(String[] args) {
        lastMove(0, "axbcxxd", 0, 'x');
    }
}
