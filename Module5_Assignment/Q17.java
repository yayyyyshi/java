// Module 5 Assignment - Question 17
// Custom annotation to validate length of a string (declarative only; validation via reflection)
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.FIELD)
@interface MinLen { int value(); }
class Account { @MinLen(6) String password = "secret"; }
public class Q17 {
    public static void main(String[] args) throws Exception {
        Field f = Account.class.getDeclaredField("password"); MinLen ml = f.getAnnotation(MinLen.class);
        String val = (String) f.get(new Account());
        System.out.println("length=" + val.length() + " minRequired=" + ml.value() + " valid=" + (val.length()>=ml.value()));
    }
}