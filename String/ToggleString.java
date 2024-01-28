package String;

import java.util.Scanner;

public class ToggleString {
    public static void toggle(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            int asci = (int) ch;
            if (asci < 97) {
                asci += 32;
                char dh = (char) asci;
                sb.setCharAt(i, dh);
            } else {
                asci -= 32;
                char dh = (char) asci;
                sb.setCharAt(i, dh);
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String that you want to toggle:-");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        toggle(sb);
    }
}
