// Module 5 Assignment - Question 28
// Demonstrate custom annotation used with reflection (method logging example)
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.METHOD)
@interface LogExec {}
class Worker { @LogExec public void doWork(){ System.out.println("working"); } }
public class Q28 {
    public static void main(String[] args) throws Exception {
        for(Method m : Worker.class.getDeclaredMethods()){
            if(m.isAnnotationPresent(LogExec.class)){
                long t0 = System.nanoTime();
                m.invoke(new Worker());
                long t1 = System.nanoTime();
                System.out.println("Executed " + m.getName() + " in " + (t1-t0) + " ns");
            }
        }
    }
}