package String;

public class PalindromicString {
    static boolean subStringCheck(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void palindromic(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (subStringCheck(str.substring(i, j))) {
                    System.out.print(str.substring(i, j) + " ");
                    count++;
                }
            }
        }
        System.out.println("\nYour total number substring are:- " + count);
    }

    public static void main(String[] args) {
        String str = "abba";
        //! One error are repeat many subStrings.
        palindromic(str);
    }
}
