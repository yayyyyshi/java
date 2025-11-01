// Module 4 Assignment - Question 51
// Simple Queue using LinkedList
import java.util.*;
public class Q51 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("a"); q.add("b"); q.add("c");
        while(!q.isEmpty()) System.out.println(q.remove());
    }
}