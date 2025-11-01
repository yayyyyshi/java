// Module 4 Assignment - Question 62
// Sort a Map by its values using a custom comparator
import java.util.*;
public class Q62 {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("A",30); m.put("B",10); m.put("C",20);
        List<Map.Entry<String,Integer>> list = new ArrayList<>(m.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for(Map.Entry<String,Integer> e : list) System.out.println(e.getKey() + " -> " + e.getValue());
    }
}