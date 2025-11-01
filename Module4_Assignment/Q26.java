// Module 4 Assignment - Question 26
// Stack class usage demonstration (java.util.Stack)
import java.util.*;
public class Q26 {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("first"); st.push("second"); st.push("third");
        System.out.println(st.pop()); // third
        System.out.println(st.peek()); // second
    }
}