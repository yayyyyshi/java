// Module 4 Assignment - Question 48
// Purpose of PriorityQueue demonstration (already shown earlier)
import java.util.*;
public class Q48 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(5,1,3));
        System.out.println(pq.poll()); // 1 (natural order)
    }
}