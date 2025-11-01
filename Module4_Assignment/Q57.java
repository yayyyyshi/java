// Module 4 Assignment - Question 57
// Collections.shuffle and sort demo
import java.util.*;
public class Q57 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(5,1,4,2,3));
        Collections.shuffle(l);
        System.out.println("Shuffled: " + l);
        Collections.sort(l);
        System.out.println("Sorted: " + l);
    }
}