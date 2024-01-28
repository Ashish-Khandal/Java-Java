package String;

import java.util.Scanner;

public class BasicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//       String str = "Surya Pandit";
//        String str = new String("Surya");
//        System.out.println(str);

//?        String str = sc.next();
//?        String str = sc.nextLine();
//        System.out.println(str);

        String str = "Surya Pandit";
//?        System.out.println(str.charAt(4));

//?        System.out.println(str.indexOf('S'));
//?        System.out.println(str.indexOf('S',1));

//?        System.out.println(str.contains("Pandit"));

        String s = "Ashish Sharma";
//?        System.out.println(str.compareTo(s));

//?        System.out.println(s.startsWith("Ashish"));
//?        System.out.println(s.endsWith("Sharma"));

//?        System.out.println(str.toLowerCase());
//?        System.out.println(str.toUpperCase());

//?        System.out.println(str.concat(s));

/*      String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
?        System.out.println(s1.equals(s2));
?        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);
        */

        String str1 = "Hello world";
//?        System.out.println(str.substring(0,5));
//?        System.out.println(str.substring(6));

        String st = "abc";
        st = st + "def";
        System.out.println(st);
        st += "xyz";
        st += 'r';
        st += 10;
        System.out.println(st+20+30);
        System.out.println(st+(20+30));

    }
}
