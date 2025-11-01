// Module 4 Assignment - Question 23
// Difference List vs Set demonstration
import java.util.*;
public class Q23 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("x"); list.add("x"); // duplicates allowed
        Set<String> set = new HashSet<>(list);
        System.out.println("List: " + list);
        System.out.println("Set: " + set);
    }
}