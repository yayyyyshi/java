// Module 5 Assignment - Question 21
// Create custom @MinLength annotation (already similar to Q17 but standalone)
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.FIELD)
@interface MinLength { int value(); }
class UserMin { @MinLength(4) String username = "john"; }
public class Q21 {
    public static void main(String[] args) throws Exception {
        MinLength ml = UserMin.class.getDeclaredField("username").getAnnotation(MinLength.class);
        System.out.println("MinLength required: " + ml.value());
    }
}