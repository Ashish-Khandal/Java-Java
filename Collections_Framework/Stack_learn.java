package Collections_Framework;

import java.util.Stack;

public class Stack_learn {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Lion");
        st.push("Dog");
        st.push("Horse");
        st.push("Cat");
        System.out.println("Stack: "+st);

        System.out.println(st.peek());

        st.pop();
        System.out.println(st.peek());
        System.out.println("Stack: "+st);
    }
}
