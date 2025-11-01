// Module 4 Assignment - Question 53
// Demonstrate Vector thread-safe additions from multiple threads
import java.util.*;
public class Q53 {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> v = new Vector<>();
        Thread t1 = new Thread(() -> { for(int i=0;i<1000;i++) v.add(i); });
        Thread t2 = new Thread(() -> { for(int i=1000;i<2000;i++) v.add(i); });
        t1.start(); t2.start(); t1.join(); t2.join();
        System.out.println("Vector size (thread-safe): " + v.size());
    }
}