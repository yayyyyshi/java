// Module 5 Assignment - Question 22
// Custom annotation to specify author and version
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface Author { String name(); double version() default 1.0; }
@Author(name="Yash", version=1.2) class CodeSample {}
public class Q22 {
    public static void main(String[] args) {
        Author a = CodeSample.class.getAnnotation(Author.class);
        System.out.println(a.name() + " v" + a.version());
    }
}