// Module 4 Assignment - Question 37
// Map interface demo: storing key-value pairs
import java.util.*;
public class Q37 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1); map.put("B",2);
        for (Map.Entry<String,Integer> e : map.entrySet()) System.out.println(e.getKey()+"->"+e.getValue());
    }
}