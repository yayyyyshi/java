// Module 4 Assignment - Question 41
// Demonstrate TreeMap sorted keys from unsorted insertion
import java.util.*;
public class Q41 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(3,"C"); tm.put(1,"A"); tm.put(2,"B"); // unsorted insertion
        System.out.println(tm); // prints sorted by keys 1,2,3
    }
}