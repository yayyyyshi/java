// Module 4 Assignment - Question 38
// Demonstrate TreeMap sorts keys
import java.util.*;
public class Q38 {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("c",3); tm.put("a",1); tm.put("b",2);
        System.out.println(tm); // keys sorted
    }
}