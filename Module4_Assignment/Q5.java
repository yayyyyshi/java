// Module 4 Assignment - Question 5
// Demonstrate raw types vs parameterized types and the runtime risk.
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        // Raw type - unsafe
        List raw = new ArrayList();
        raw.add("hello");    // allowed
        raw.add(123);          // allowed - mixed types
        try {
            // unsafe cast: expecting String but contains Integer at index 1
            String s = (String) raw.get(1);
            System.out.println(s);
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException from raw type: " + e.getMessage());
        }

        // Parameterized type - safe at compile time
        List<String> safe = new ArrayList<>();
        safe.add("world");
        // safe.add(123); // compile-time error if uncommented
        for (String str : safe) System.out.println("Safe item: " + str);
    }
}