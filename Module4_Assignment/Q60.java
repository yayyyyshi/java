// Module 4 Assignment - Question 60
// Collections.frequency demo
import java.util.*;
public class Q60 {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("a","b","a","c","a");
        System.out.println("Frequency of a: " + Collections.frequency(l, "a"));
    }
}