package String;

public class SubString {
    public static void subStringFind(String str) {
        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "abed";
        subStringFind(str);
    }
}
