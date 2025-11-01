// Module 4 Assignment - Question 36
// LinkedHashSet preserves insertion order
import java.util.*;
public class Q36 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("one"); lhs.add("two"); lhs.add("three");
        for (String s : lhs) System.out.println(s);
    }
}