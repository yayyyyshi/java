// Module 4 Assignment - Question 47
// Check palindrome using Deque
import java.util.*;
public class Q47 {
    public static void main(String[] args) {
        String s = "racecar";
        ArrayDeque<Character> dq = new ArrayDeque<>();
        for(char c: s.toCharArray()) dq.addLast(c);
        boolean pal = true;
        while(dq.size()>1){ if(!dq.removeFirst().equals(dq.removeLast())){ pal=false; break; } }
        System.out.println(s + " is palindrome? " + pal);
    }
}