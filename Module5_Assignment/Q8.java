// Module 5 Assignment - Question 8
// Retention policy types demo: SOURCE, CLASS, RUNTIME
import java.lang.annotation.*;
@Retention(RetentionPolicy.SOURCE) @interface RetSource {}
@Retention(RetentionPolicy.CLASS) @interface RetClass {}
@Retention(RetentionPolicy.RUNTIME) @interface RetRuntime {}
@RetRuntime class R1 {}
public class Q8 {
    public static void main(String[] args) {
        System.out.println("RetRuntime present: " + R1.class.isAnnotationPresent(RetRuntime.class));
        // RetSource not available at runtime; RetClass may or may not depending on JVM
    }
}