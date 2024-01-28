package Recursion;

public class Remove_Duplicate_Char {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(int idx, String str, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            removeDuplicates(idx + 1, str, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(idx + 1, str, newString);
        }
    }

    public static void main(String[] args) {
        removeDuplicates(0, "abbccda", "");
    }
}
