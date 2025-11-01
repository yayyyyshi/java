// Module 4 Assignment - Question 9
// Generic Stack<T> providing push, pop, peek
import java.util.*;
public class Q9 {
    static class StackGeneric<T> {
        private LinkedList<T> data = new LinkedList<>();
        public void push(T item){ data.addFirst(item); }
        public T pop(){ return data.removeFirst(); }
        public T peek(){ return data.getFirst(); }
        public boolean isEmpty(){ return data.isEmpty(); }
    }
    public static void main(String[] args) {
        StackGeneric<Integer> st = new StackGeneric<>();
        st.push(10); st.push(20); System.out.println(st.pop()); //20
        st.push(30); System.out.println(st.peek()); //30

        StackGeneric<String> sst = new StackGeneric<>();
        sst.push("x"); sst.push("y"); System.out.println(sst.pop()); //y
    }
}