// Module 5 Assignment - Question 4
// Demonstrate @SuppressWarnings usage
import java.util.*;
public class Q4 {
    @SuppressWarnings({"unchecked","deprecation"})
    public static void main(String[] args) {
        List raw = new ArrayList(); // unchecked warning
        raw.add("a"); raw.add(1);
        // call deprecated method to show suppression
        deprecatedMethod();
        System.out.println("Suppressed warnings demo: " + raw);
    }
    @Deprecated static void deprecatedMethod() {}
}