// Module 5 Assignment - Question 11
// Difference between @Retention RUNTIME and CLASS (RUNTIME available via reflection)
import java.lang.annotation.*;
@Retention(RetentionPolicy.CLASS) @interface ClassRetention {}
@Retention(RetentionPolicy.RUNTIME) @interface RuntimeRetention {}
@RuntimeRetention class A {}
public class Q11 {
    public static void main(String[] args) {
        System.out.println("RuntimeRetention present: " + A.class.isAnnotationPresent(RuntimeRetention.class));
    }
}