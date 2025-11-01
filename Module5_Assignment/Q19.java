// Module 5 Assignment - Question 19
// @Documented meta-annotation demo (affects javadoc generation; we just show presence)
import java.lang.annotation.*;
@Documented @Retention(RetentionPolicy.RUNTIME) @interface DocAnn {}
@DocAnn class D {}
public class Q19 {
    public static void main(String[] args) { System.out.println("DocAnn present: " + D.class.isAnnotationPresent(DocAnn.class)); }
}