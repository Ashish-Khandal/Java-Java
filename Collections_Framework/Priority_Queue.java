package Collections_Framework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println("This is a MinimumPriority Queue.");
        pq.offer(800);
        pq.offer(100);
        pq.offer(300);
        pq.offer(900);
        pq.offer(1000);
        pq.offer(200);
        pq.offer(400);
        //! PriorityQueue always priority minimum element in a queue
        System.out.println(pq);

        System.out.println(pq.peek());

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek() + "\n");

        /*! But create Maximum Queue */
        System.out.println("This is a MaximumPriority Queue.\n");
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.offer(800);
        pq2.offer(100);
        pq2.offer(300);
        pq2.offer(900);
        pq2.offer(1000);
        pq2.offer(200);
        pq2.offer(400);
        //! PriorityQueue always priority minimum element in a queue
        System.out.println(pq2);

        System.out.println(pq2.peek());

        pq2.poll();
        System.out.println(pq2);

        System.out.println(pq2.peek());
    }
}
