// Module 5 Assignment - Question 62
// Show how frameworks like Spring use annotations: example reading @Deprecated-like marker for component
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.TYPE) @interface Component { String value() default ""; }
@Component("svc") class Svc {}
public class Q62 {
    public static void main(String[] args) {
        Component c = Svc.class.getAnnotation(Component.class);
        System.out.println("Component name: " + c.value());
    }
}