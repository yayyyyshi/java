// Module 4 Assignment - Question 42
// Difference between HashMap and LinkedHashMap iteration order demonstration
import java.util.*;
public class Q42 {
    public static void main(String[] args) {
        HashMap<String,Integer> h = new HashMap<>();
        h.put("one",1); h.put("two",2); h.put("three",3);
        LinkedHashMap<String,Integer> lh = new LinkedHashMap<>();
        lh.put("one",1); lh.put("two",2); lh.put("three",3);
        System.out.println("HashMap iteration: "+h.keySet());
        System.out.println("LinkedHashMap iteration: "+lh.keySet());
    }
}