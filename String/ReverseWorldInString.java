package String;

public class ReverseWorldInString {
    public static void main(String[] args) {
        String str = "My name is Surya.";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            } else {
                ans += sb.reverse()+" ";
             // sb = new StringBuilder("");
                sb.delete(0,sb.length());
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}
