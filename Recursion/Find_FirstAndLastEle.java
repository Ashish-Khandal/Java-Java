package Recursion;

public class Find_FirstAndLastEle {
    public static int first = -1, last = -1;

    public static void string_find(int idx, String s,char element) {
        if (idx==s.length()-1){
            System.out.println("Your element "+element+" first index is:- "+first);
            System.out.println("Your element "+element+" last index is:- "+last);
            return;
        }
        char currChar = s.charAt(idx);
        if (currChar == element) {
            if (first==-1){
                first=idx;
            }else {
                last=idx;
            }
        }
        string_find(idx+=1,s,element);
    }

    public static void main(String[] args) {
        String s = "abaacdaefaah";
        string_find(0, s,'a');
    }
}
