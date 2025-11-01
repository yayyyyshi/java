// Module 4 Assignment - Question 24
// Use ArrayList for storing and iterating
import java.util.*;
public class Q24 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("one"); arr.add("two"); arr.add("three");
        for(String s : arr) System.out.println(s);
    }
}