// Module 4 Assignment - Question 44
// PriorityQueue storing tasks with priorities (lower number = higher priority)
import java.util.*;
public class Q44 {
    static class Task implements Comparable<Task> {
        String name; int pr;
        Task(String n,int p){name=n;pr=p;}
        public int compareTo(Task o){ return Integer.compare(this.pr,o.pr); }
        public String toString(){ return name+"("+pr+")"; }
    }
    public static void main(String[] args) {
        PriorityQueue<Task> pq = new PriorityQueue<>();
        pq.add(new Task("Low",5)); pq.add(new Task("High",1)); pq.add(new Task("Med",3));
        System.out.println("Removed: " + pq.remove()); // High(1)
        System.out.println("Remaining: " + pq);
    }
}