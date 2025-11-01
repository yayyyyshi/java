// Module 5 Assignment - Question 20
// How annotations are processed during compilation: simulated by checking for SOURCE-retention annotation
import java.lang.annotation.*;
@Retention(RetentionPolicy.SOURCE) @interface CompileOnly {}
@CompileOnly class C {}
public class Q20 {
    public static void main(String[] args) {
        System.out.println("CompileOnly exists in source but not at runtime: " + C.class.getAnnotations().length + " runtime annotations on C"); 
    }
}