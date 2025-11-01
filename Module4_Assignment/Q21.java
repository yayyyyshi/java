// Module 4 Assignment - Question 21
// Iterate over a List of integers using for, enhanced for, and Iterator
import java.util.*;
public class Q21 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40);
        System.out.println("Simple for:"); for(int i=0;i<list.size();i++) System.out.println(list.get(i));
        System.out.println("Enhanced for:"); for(int v: list) System.out.println(v);
        System.out.println("While with iterator:"); Iterator<Integer> it = list.iterator(); while(it.hasNext()) System.out.println(it.next());
    }
}