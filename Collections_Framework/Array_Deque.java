package Collections_Framework;

import java.util.ArrayDeque;

public class Array_Deque {
    //! डेक
    public static void main(String[] args) {
        ArrayDeque<Integer> adk = new ArrayDeque<>();
        adk.offer(18);
        adk.offer(27);
        adk.offer(36);
        adk.offerFirst(9);//! this function add element first position in a queue.
        adk.offerLast(45);//! this function add element last position in a queue (same for offer() function).
        System.out.println(adk);

        System.out.println("Simple peek() Function: " + adk.peek());
        System.out.println("First peek() Function: " + adk.peekFirst());
        System.out.println("Last peek() Function: " + adk.peekLast());

        System.out.println("Simple poll() Function: " + adk.poll());
        System.out.println("poll() " + adk);

        System.out.println("First poll() Function: " + adk.pollFirst());
        System.out.println("pollFirst() " + adk);

        System.out.println("Last poll() Function: " + adk.pollLast());
        System.out.println("pollLast() " + adk);

    }
}
