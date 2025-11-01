// Module 4 Assignment - Question 59
// Collections.binarySearch demo (list must be sorted)
import java.util.*;
public class Q59 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,7,9);
        System.out.println(Collections.binarySearch(list, 5)); // index 2
    }
}