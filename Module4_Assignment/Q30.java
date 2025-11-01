// Module 4 Assignment - Question 30
// Explanation demo: Set vs List behavior
import java.util.*;
public class Q30 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2));
        Set<Integer> set = new HashSet<>(list);
        System.out.println("List (allows duplicate): " + list);
        System.out.println("Set (unique elements): " + set);
    }
}