// Module 5 Assignment - Question 6
// List meta-annotations: @Retention, @Target, @Documented, @Inherited, @Repeatable (demo)
import java.lang.annotation.*;
@Documented @Inherited @Retention(RetentionPolicy.RUNTIME) @Target(ElementType.TYPE)
@interface MetaDemo {}
@MetaDemo class Parent {}
class Child extends Parent {}
public class Q6 {
    public static void main(String[] args) {
        System.out.println("Meta annotations demo: Child inherits? " + Child.class.isAnnotationPresent(MetaDemo.class));
    }
}