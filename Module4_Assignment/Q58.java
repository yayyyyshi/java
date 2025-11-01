// Module 4 Assignment - Question 58
// Create unmodifiable List and show modification attempt fails
import java.util.*;
public class Q58 {
    public static void main(String[] args) {
        List<String> un = Collections.unmodifiableList(Arrays.asList("a","b","c"));
        System.out.println(un);
        try { un.add("d"); } catch(Exception e){ System.out.println("Modify failed: " + e.getClass().getSimpleName()); }
    }
}