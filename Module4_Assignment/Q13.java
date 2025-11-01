// Module 4 Assignment - Question 13
// Difference between Collection (interface) and Collections (utility class)
import java.util.*;
public class Q13 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1); c.add(2);
        Collections.addAll((List<Integer>)c, 3,4); // Collections utility used on Collection
        System.out.println(c);
    }
}