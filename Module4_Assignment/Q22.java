// Module 4 Assignment - Question 22
// Generic method to print any Collection
import java.util.*;
public class Q22 {
    public static <T> void printAll(Collection<T> c){
        for(T t : c) System.out.println(t);
    }
    public static void main(String[] args) {
        printAll(Arrays.asList("a","b","c"));
        printAll(new HashSet<>(Arrays.asList(1,2,3)));
    }
}