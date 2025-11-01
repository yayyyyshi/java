// Module 4 Assignment - Question 14
// Role of Iterator: iterate and remove safely
import java.util.*;
public class Q14 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            Integer v = it.next();
            System.out.println(v);
            if (v==2) it.remove(); // safe removal during iteration
        }
        System.out.println("After removal: " + list);
    }
}