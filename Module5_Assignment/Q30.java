// Module 5 Assignment - Question 30
// What happens if annotation not annotated with @Retention? Default is CLASS; not available at runtime.
import java.lang.annotation.*;
@interface NoRetention {}
@NoRetention class NR {}
public class Q30 {
    public static void main(String[] args) {
        System.out.println("NoRetention at runtime present? " + NR.class.isAnnotationPresent(NoRetention.class));
    }
}