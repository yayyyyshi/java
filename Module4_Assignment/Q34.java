// Module 4 Assignment - Question 34
// Demonstrate uniqueness property of HashSet by attempting duplicate adds
import java.util.*;
public class Q34 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        System.out.println(hs.add("hello")); // true
        System.out.println(hs.add("hello")); // false - duplicate ignored
        System.out.println(hs);
    }
}