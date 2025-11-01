// Module 4 Assignment - Question 20
// Benefits of Collections over arrays: dynamic, utilities, flexible implementations
import java.util.*;
public class Q20 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++) list.add(i);
        list.remove(2);
        Collections.reverse(list);
        System.out.println(list);
    }
}