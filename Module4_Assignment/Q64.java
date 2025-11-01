// Module 4 Assignment - Question 64
// Book catalog in TreeMap sorted by title; allow basic operations
import java.util.*;
public class Q64 {
    public static void main(String[] args) {
        TreeMap<String,String> catalog = new TreeMap<>();
        catalog.put("Clean Code","Robert Martin"); catalog.put("Effective Java","Joshua Bloch"); catalog.put("Design Patterns","Gamma");
        System.out.println(catalog);
        System.out.println("Search 'Effective Java': " + catalog.get("Effective Java"));
        catalog.remove("Design Patterns"); System.out.println("After remove: " + catalog);
    }
}