// Module 4 Assignment - Question 10
// MinMaxFinder<T extends Comparable<T>> example for integers and strings
import java.util.*;
public class Q10 {
    static class MinMaxFinder<T extends Comparable<T>> {
        private List<T> items;
        public MinMaxFinder(List<T> items){ this.items = items; }
        public T findMin(){ return Collections.min(items); }
        public T findMax(){ return Collections.max(items); }
    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,2,8,1);
        MinMaxFinder<Integer> im = new MinMaxFinder<>(nums);
        System.out.println("Min="+im.findMin()+" Max="+im.findMax());
        List<String> words = Arrays.asList("pear","apple","banana");
        MinMaxFinder<String> sm = new MinMaxFinder<>(words);
        System.out.println("Min="+sm.findMin()+" Max="+sm.findMax());
    }
}