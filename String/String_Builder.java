package String;

import java.util.Scanner;

public class String_Builder {
    public static void main(String[] args) {
//?        StringBuilder str = new StringBuilder(100); // capacity

//?        StringBuilder str = new StringBuilder("Hello");
//?        System.out.println(str);

        System.out.print("Enter your String:-");
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine()); // Hello
        System.out.println(str);

        //! Methods

        str.append("World");
        str.append(10);
        System.out.println(str);

        str.setCharAt(0, 'K');
        System.out.println(str);

        str.insert(0, "My");
        System.out.println(str);

        str.deleteCharAt(12);
        System.out.println(str);

        str.delete(7, 13);
        System.out.println(str);

        StringBuilder sb = new StringBuilder("Surya");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
