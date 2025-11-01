// Module 4 Assignment - Question 35
// TreeSet operations: add, find smallest/largest, remove
import java.util.*;
public class Q35 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10); ts.add(2); ts.add(7);
        System.out.println("Smallest=" + ts.first());
        System.out.println("Largest=" + ts.last());
        ts.remove(2);
        System.out.println(ts);
    }
}