// Module 4 Assignment - Question 11
// Demonstrate common utilities from java.util: Random, Arrays, Optional
import java.util.*;
public class Q11 {
    public static void main(String[] args) {
        Random r = new Random(0);
        System.out.println("Random int: " + r.nextInt(100));
        int[] a = {3,1,2};
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
        Optional<Integer> o = Optional.of(5);
        System.out.println("Optional present: " + o.isPresent());
    }
}