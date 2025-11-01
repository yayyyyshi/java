// Module 4 Assignment - Question 31
// Demonstrate TreeSet sorted storage
import java.util.*;
public class Q31 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5); ts.add(1); ts.add(3);
        System.out.println(ts); // prints [1,3,5]
    }
}