// Module 4 Assignment - Question 18
// Differences between Set, List, Queue with small demos
import java.util.*;
public class Q18 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2));
        Set<Integer> set = new HashSet<>(list);
        Queue<Integer> q = new ArrayDeque<>(list);
        System.out.println("List (allows duplicates): " + list);
        System.out.println("Set (unique): " + set);
        System.out.println("Queue (FIFO poll): " + q.poll());
    }
}