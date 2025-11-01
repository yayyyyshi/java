// Module 5 Assignment - Question 29
// Define custom annotation to log method execution time and use it
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.METHOD)
@interface TimeIt {}
class Service { @TimeIt void serve(){ for(int i=0;i<10000;i++); } }
public class Q29 {
    public static void main(String[] args) throws Exception {
        for(Method m : Service.class.getDeclaredMethods()){
            if(m.isAnnotationPresent(TimeIt.class)){
                long s = System.nanoTime(); m.invoke(new Service()); long e = System.nanoTime();
                System.out.println("Method " + m.getName() + " took " + (e-s) + " ns"); 
            }
        }
    }
}