// Module 5 Assignment - Question 60
// Using annotation to mark methods for transaction (simulation)
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.METHOD)
@interface Transactional {}
class Repo { @Transactional public void save(){ System.out.println("saving..."); } }
public class Q60 {
    public static void main(String[] args) throws Exception {
        for(java.lang.reflect.Method m: Repo.class.getDeclaredMethods()){
            if(m.isAnnotationPresent(Transactional.class)){
                System.out.println(m.getName() + " is transactional (would be proxied by framework)"); 
            }
        }
    }
}