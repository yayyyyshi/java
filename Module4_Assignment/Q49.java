// Module 4 Assignment - Question 49
// Difference Deque vs Queue demonstration
import java.util.*;
public class Q49 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Deque<Integer> dq = new ArrayDeque<>();
        q.add(1); q.add(2);
        dq.addFirst(1); dq.addLast(2);
        System.out.println("Queue poll: " + q.poll());
        System.out.println("Deque removeLast: " + dq.removeLast());
    }
}