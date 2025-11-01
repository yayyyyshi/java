// Module 4 Assignment - Question 4
// Demonstrate ? extends T vs ? super T
import java.util.*;
public class Q4 {
    static void readNumbers(List<? extends Number> src) {
        // can read as Number
        for (Number n : src) System.out.println("read: " + n);
    }
    static void writeIntegers(List<? super Integer> dst) {
        // can add Integer or subclasses
        dst.add(100);
    }
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(10);
        writeIntegers(ints); // OK
        readNumbers(ints); // OK
        List<Number> nums = new ArrayList<>();
        writeIntegers(nums);
        // readNumbers(nums); // also OK because Number extends Number
    }
}