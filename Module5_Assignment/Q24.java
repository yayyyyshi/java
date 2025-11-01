// Module 5 Assignment - Question 24
// Restrictions on defining annotation methods: no parameters, only primitives, String, Class, enums, annotations, arrays
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface AllowedTypes { int n(); String s(); Class<?> type(); }
@AllowedTypes(n=1,s="s",type=String.class) class UsesAllowed {}
public class Q24 {
    public static void main(String[] args) {
        AllowedTypes a = UsesAllowed.class.getAnnotation(AllowedTypes.class);
        System.out.println(a.n() + "," + a.s() + "," + a.type().getSimpleName());
    }
}