package Collections_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(5);
        que.offer(10);
        que.offer(15);
        que.offer(20);
//!     We are use add() function but this function throw exception
        System.out.println("Queue: "+que);

//!     We are use remove() function but this function throw exception
        que.poll();
        System.out.println(que);

//!     We are use element() function but this function throw exception if queue is empty
        System.out.println(que.peek());

    }
}
