// Module 5 Assignment - Question 9
// How to create a custom annotation and use it
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MinLength { int value(); }
class User { @MinLength(5) String name = "Alice"; }
public class Q9 {
    public static void main(String[] args) throws Exception {
        MinLength ml = User.class.getDeclaredField("name").getAnnotation(MinLength.class);
        System.out.println("MinLength for name: " + ml.value());
    }
}