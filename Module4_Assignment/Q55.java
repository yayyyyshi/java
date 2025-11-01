// Module 4 Assignment - Question 55
// Demonstrate CopyOnWriteArrayList safe iteration+modify
import java.util.concurrent.*;
import java.util.*;
public class Q55 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> cow = new CopyOnWriteArrayList<>(Arrays.asList(1,2,3));
        for(Integer i : cow) {
            System.out.println(i);
            cow.add(4); // safe: creates new copy
            break;
        }
        System.out.println(cow);
    }
}