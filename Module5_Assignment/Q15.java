// Module 5 Assignment - Question 15
// Can annotations be inherited? Demonstrate @Inherited
import java.lang.annotation.*;
@Inherited @Retention(RetentionPolicy.RUNTIME) @interface Inh {}
@Inh class SuperClass {}
class SubClass extends SuperClass {}
public class Q15 {
    public static void main(String[] args) {
        System.out.println("SubClass has Inh? " + SubClass.class.isAnnotationPresent(Inh.class));
    }
}