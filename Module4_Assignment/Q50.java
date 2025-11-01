// Module 4 Assignment - Question 50
// BlockingQueue vs PriorityQueue demonstration (conceptual small code)
import java.util.concurrent.*;
public class Q50 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(2);
        bq.put(1); bq.put(2);
        System.out.println("BlockingQueue full, take: " + bq.take());
        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();
        pbq.add(5); pbq.add(1);
        System.out.println("PriorityBlockingQueue poll: " + pbq.poll());
    }
}