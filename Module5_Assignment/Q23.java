// Module 5 Assignment - Question 23
// Process custom annotations using java.lang.annotation.Annotation and reflection
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME) @interface Info { String value(); }
class C1 { @Info("f1") int f1; @Info("f2") int f2; }
public class Q23 {
    public static void main(String[] args) throws Exception {
        for(Field f : C1.class.getDeclaredFields()) {
            Annotation ann = f.getAnnotation(Info.class);
            if(ann!=null) System.out.println(f.getName() + " -> " + ((Info)ann).value());
        }
    }
}