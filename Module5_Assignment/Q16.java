// Module 5 Assignment - Question 16
// Default values in annotations example
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface InfoDef { String author() default "unknown"; int version() default 1; }
@InfoDef(author="Yash", version=2) class Doc {}
public class Q16 {
    public static void main(String[] args) {
        InfoDef id = Doc.class.getAnnotation(InfoDef.class);
        System.out.println("author="+id.author()+" version="+id.version());
    }
}