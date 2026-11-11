import java.util.Deque;
import java.util.LinkedList;

public class QueueDS {

    /*
        Queue: is a linear-data structure that follows the First In First Out rule.
     */
    public static void main(String[] args) {

        Deque<Integer> queue = new LinkedList<>();

        //offer method
        queue.offer(10);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);

        System.out.println(queue);

        //poll method
        System.out.println("remove element: " + queue.poll());

        //isempty method
        System.out.println("is queue empty? " + queue.isEmpty());
    }
}
