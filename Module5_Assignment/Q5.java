// Module 5 Assignment - Question 5
// What are meta-annotations? Demonstrate @Retention and @Target usage on a custom annotation.
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ExampleMeta {}
@ExampleMeta class AnnotatedClass {}
public class Q5 {
    public static void main(String[] args) {
        boolean present = AnnotatedClass.class.isAnnotationPresent(ExampleMeta.class);
        System.out.println("ExampleMeta present on AnnotatedClass? " + present);
    }
}