// Module 4 Assignment - Question 54
// Demonstrate ConcurrentHashMap basic concurrent usage
import java.util.concurrent.*;
public class Q54 {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer,String> chm = new ConcurrentHashMap<>();
        Thread t1 = new Thread(() -> { for(int i=0;i<100;i++) chm.put(i, "A"+i); });
        Thread t2 = new Thread(() -> { for(int i=100;i<200;i++) chm.put(i, "B"+i); });
        t1.start(); t2.start(); t1.join(); t2.join();
        System.out.println("Size: " + chm.size());
    }
}