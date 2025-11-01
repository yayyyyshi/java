// Module 4 Assignment - Question 45
// Stack class operations demo: push, pop, peek, isEmpty
import java.util.*;
public class Q45 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10); s.push(20);
        System.out.println(s.pop()); // 20
        System.out.println(s.peek()); // 10
        System.out.println(s.empty()); // false
    }
}