// Module 4 Assignment - Question 19
// Significance of Iterable interface: enable for-each loop
import java.util.*;
public class Q19 {
    public static void main(String[] args) {
        Iterable<Integer> itbl = Arrays.asList(1,2,3);
        for (Integer i : itbl) System.out.println(i); // works because Iterable
    }
}