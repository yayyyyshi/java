// Module 4 Assignment - Question 32
// Demonstrate HashSet handles duplicates
import java.util.*;
public class Q32 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("a"); hs.add("a"); hs.add("b");
        System.out.println(hs); // only unique elements
    }
}