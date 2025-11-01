// Module 4 Assignment - Question 56
// synchronizedCollection vs ConcurrentHashMap conceptual demo
import java.util.*;
import java.util.concurrent.*;
public class Q56 {
    public static void main(String[] args) {
        List<Integer> sync = Collections.synchronizedList(new ArrayList<Integer>());
        ConcurrentHashMap<Integer,String> chm = new ConcurrentHashMap<>();
        sync.add(1); chm.put(1, "A");
        System.out.println(sync + " | " + chm);
    }
}