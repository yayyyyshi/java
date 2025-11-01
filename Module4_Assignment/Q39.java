// Module 4 Assignment - Question 39
// Difference between Hashtable and HashMap
import java.util.*;
public class Q39 {
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<>();
        hm.put(null, 1);
        System.out.println("HashMap allows null keys: " + hm);
        Hashtable<String,Integer> ht = new Hashtable<>();
        ht.put("x", 2);
        System.out.println("Hashtable (legacy) contents: " + ht);
    }
}