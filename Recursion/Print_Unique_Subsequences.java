package Recursion;

import java.util.HashSet;

public class Print_Unique_Subsequences {
    public static void subseqPrint(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        //? to be
        subseqPrint(str, idx + 1, newString + currChar,set);
        //? or not to be
        subseqPrint(str, idx + 1, newString,set);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        subseqPrint("aaa", 0, "",set);
    }
}
