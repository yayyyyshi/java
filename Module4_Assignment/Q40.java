// Module 4 Assignment - Question 40
// HashMap of employee IDs and names; add, containsKey, iterate keySet & entrySet
import java.util.*;
public class Q40 {
    public static void main(String[] args) {
        Map<Integer,String> emp = new HashMap<>();
        emp.put(101, "Alice"); emp.put(102, "Bob"); emp.put(103, "Carol");
        System.out.println("Has 102? " + emp.containsKey(102));
        System.out.println("KeySet iteration:"); for(Integer k : emp.keySet()) System.out.println(k + " -> " + emp.get(k));
        System.out.println("EntrySet iteration:"); for(Map.Entry<Integer,String> e : emp.entrySet()) System.out.println(e.getKey() + " -> " + e.getValue());
    }
}