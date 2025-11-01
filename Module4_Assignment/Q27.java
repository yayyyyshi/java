// Module 4 Assignment - Question 27
// Create List of strings and add/remove/replace operations
import java.util.*;
public class Q27 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("A"); l.add("B"); l.add("C"); System.out.println(l);
        l.remove("B"); System.out.println("After remove by value: " + l);
        l.remove(0); System.out.println("After remove by index: " + l);
        l.add(0, "X"); l.set(1, "Y"); System.out.println("After add & replace: " + l);
    }
}