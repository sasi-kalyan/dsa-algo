import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackDS {

    /*
        Stack: is the linear data structure that follows the Last in First out rule while appending the elements

        [  10  ] <- peek/top
        [  20  ]
        [  30  ]
        [  40  ]
     */

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(90);

        System.out.println(stack);

        System.out.println("peek element: " + stack.peek());
        System.out.println("remove element: " + stack.pop());

        System.out.println("is stack empty: " + stack.isEmpty());
    }
}
