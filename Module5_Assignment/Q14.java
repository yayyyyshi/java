// Module 5 Assignment - Question 14
// How annotations integrate with frameworks (simple simulated example)
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME) @interface Service { String name(); }
@Service(name="MyService") class MyService { void serve(){ System.out.println("serving"); } }
public class Q14 {
    public static void main(String[] args) throws Exception {
        Service s = MyService.class.getAnnotation(Service.class);
        if(s!=null) System.out.println("Found service: " + s.name());
    }
}