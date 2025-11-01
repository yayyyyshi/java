// Module 5 Assignment - Question 7
// How annotations affect runtime behavior: frameworks use reflection to read annotations
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface RuntimeMarker { String value(); }
@RuntimeMarker("demo") class Marked {}
public class Q7 {
    public static void main(String[] args) {
        RuntimeMarker m = Marked.class.getAnnotation(RuntimeMarker.class);
        System.out.println("RuntimeMarker value: " + m.value());
    }
}