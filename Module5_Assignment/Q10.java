// Module 5 Assignment - Question 10
// Use of @Target meta-annotation demo
import java.lang.annotation.*;
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface AllowedOnMethodOrType {}
@AllowedOnMethodOrType class C {
    @AllowedOnMethodOrType void m(){}
}
public class Q10 {
    public static void main(String[] args) {
        System.out.println("C annotated? " + C.class.isAnnotationPresent(AllowedOnMethodOrType.class));
    }
}