// Module 4 Assignment - Question 46
// Deque operations with ArrayDeque
import java.util.*;
public class Q46 {
    public static void main(String[] args) {
        ArrayDeque<String> dq = new ArrayDeque<>();
        dq.addFirst("a"); dq.addLast("b"); dq.addLast("c");
        System.out.println(dq.removeFirst()); // a
        System.out.println(dq.removeLast()); // c
        System.out.println(dq.peekFirst()); // b
    }
}