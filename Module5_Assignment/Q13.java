// Module 5 Assignment - Question 13
// Marker annotation vs single-value annotation
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME) @interface Marker {}
@Retention(RetentionPolicy.RUNTIME) @interface Single { String value(); }
@Marker class M {}
@Single("hello") class S {}
public class Q13 {
    public static void main(String[] args) {
        System.out.println("Marker present: " + M.class.isAnnotationPresent(Marker.class));
        System.out.println("Single value: " + S.class.getAnnotation(Single.class).value());
    }
}