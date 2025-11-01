// Module 4 Assignment - Question 25
// Role of Vector and difference from ArrayList (thread-safety demonstration)
import java.util.*;
public class Q25 {
    public static void main(String[] args) throws Exception {
        Vector<Integer> v = new Vector<>();
        ArrayList<Integer> a = new ArrayList<>();
        Thread t1 = new Thread(() -> { for(int i=0;i<1000;i++) { v.add(i); a.add(i); } });
        Thread t2 = new Thread(() -> { for(int i=1000;i<2000;i++) { v.add(i); a.add(i); } });
        t1.start(); t2.start(); t1.join(); t2.join();
        System.out.println("Vector size (thread-safe): " + v.size());
        System.out.println("ArrayList size (may be inconsistent): " + a.size());
    }
}