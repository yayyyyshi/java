// Module 4 Assignment - Question 43
// Queue with LinkedList simulating simple ticket booking
import java.util.*;
public class Q43 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("T1"); q.add("T2"); q.add("T3"); // customers
        System.out.println("Serving: " + q.remove()); // T1
        System.out.println("Next: " + q.peek());
    }
}