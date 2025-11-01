// Module 5 Assignment - Question 61
// Demonstrate default values and optional elements in annotations (reiteration)
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface Meta { String value() default "none"; int v() default 1; }
@Meta String s;
public class Q61 {
    public static void main(String[] args) {
        System.out.println("Annotation Meta has defaults and can be omitted when applied."); 
    }
}