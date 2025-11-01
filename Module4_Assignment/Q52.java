// Module 4 Assignment - Question 52
// Demonstrate WeakHashMap garbage collection behavior (may vary)
import java.util.*;
public class Q52 {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap<Object,String> whm = new WeakHashMap<>();
        Object key = new Object();
        whm.put(key, "value");
        System.out.println("Before nulling key: " + whm);
        key = null;
        System.gc();
        Thread.sleep(100);
        System.out.println("After GC (may be empty): " + whm);
    }
}