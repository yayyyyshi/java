// Module 4 Assignment - Question 17
// Difference between Collection and Map
import java.util.*;
public class Q17 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        Map<String,Integer> m = new HashMap<>();
        c.add("a"); m.put("a",1);
        System.out.println("Collection size: " + c.size() + ", Map size: " + m.size());
    }
}