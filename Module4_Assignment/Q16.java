// Module 4 Assignment - Question 16
// Key interfaces in Collection Framework demo relationships
import java.util.*;
public class Q16 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();
        list.add(1); set.add(1); queue.add(1);
        System.out.println(list.getClass().getSimpleName() + ", " + set.getClass().getSimpleName() + ", " + queue.getClass().getSimpleName());
    }
}