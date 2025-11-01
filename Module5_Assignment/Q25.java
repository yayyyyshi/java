// Module 5 Assignment - Question 25
// Annotations with array parameters example
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface Roles { String[] value(); }
@Roles({"ADMIN","USER"}) class SecureClass {}
public class Q25 {
    public static void main(String[] args) {
        Roles r = SecureClass.class.getAnnotation(Roles.class);
        for(String s : r.value()) System.out.println(s);
    }
}