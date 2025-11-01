// Module 4 Assignment - Question 29
// Sort ArrayList of strings alphabetically and reverse
import java.util.*;
public class Q29 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(Arrays.asList("banana","apple","cherry"));
        Collections.sort(l);
        System.out.println("Alphabetical: " + l);
        Collections.sort(l, Collections.reverseOrder());
        System.out.println("Reverse alphabetical: " + l);
    }
}