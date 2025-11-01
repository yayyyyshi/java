// Module 4 Assignment - Question 12
// Show Collection Framework features: interfaces, implementations, algorithms
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("b","a","c"));
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
        Set<String> set = new HashSet<>(list);
        System.out.println("Set size (uniqueness): " + set.size());
    }
}