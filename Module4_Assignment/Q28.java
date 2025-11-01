// Module 4 Assignment - Question 28
// Compare ArrayList vs LinkedList for add at beginning, remove middle, iteration
import java.util.*;
public class Q28 {
    public static void main(String[] args) {
        final int N = 5000;
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        long t1 = System.nanoTime();
        for(int i=0;i<N;i++) al.add(0,i);
        long t2 = System.nanoTime();
        for(int i=0;i<N;i++) ll.add(0,i);
        long t3 = System.nanoTime();
        System.out.println("Add at beginning: ArrayList=" + (t2-t1) + " ns, LinkedList=" + (t3-t2) + " ns");
        // remove from middle
        t1 = System.nanoTime(); al.remove(al.size()/2); t2 = System.nanoTime();
        t3 = System.nanoTime(); ll.remove(ll.size()/2); long t4 = System.nanoTime();
        System.out.println("Remove middle: ArrayList=" + (t2-t1) + " ns, LinkedList=" + (t4-t3) + " ns");
    }
}