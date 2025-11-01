// Module 5 Assignment - Question 12
// Using reflection to process annotations (scan fields & methods)
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Info { String value(); }
class Person { @Info("id field") int id; @Info("name field") String name = "Bob"; }
public class Q12 {
    public static void main(String[] args) throws Exception {
        for(Field f : Person.class.getDeclaredFields()) {
            Info info = f.getAnnotation(Info.class);
            if(info!=null) System.out.println(f.getName() + " -> " + info.value());
        }
    }
}