package Recursion;

public class Print_Subsequences {
    public static void subseqPrint(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //? to be
        subseqPrint(str, idx + 1, newString + currChar);
        //? or not to be
        subseqPrint(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        subseqPrint("abc", 0, "");
    }
}
