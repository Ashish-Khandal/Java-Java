package Recursion;

public class Print_Reverse_String {
    public static void reversePrint(int index, String s) {
        System.out.print(s.charAt(index));
        if (index == 0) {
            return;
        }
        reversePrint(index = index - 1, s);
    }

    public static void main(String[] args) {
        String s = "abcd";
        reversePrint(s.length() - 1, s);
    }
}
