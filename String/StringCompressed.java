package String;

public class StringCompressed {
    public static void main(String[] args) {
        String str = "aaabbbbccddde";
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            char preCh = str.charAt(i - 1);
            if (ch == preCh) {
                count++;
            } else {
                sb.append(preCh);
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1));
        if (count > 1) {
            sb.append(count);
        }
//        str="";
//        str+=sb;
        System.out.print(sb);
    }
}
