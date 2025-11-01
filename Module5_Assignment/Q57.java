// Module 5 Assignment - Question 57
// Use-case: annotation-based validation runtime demo (simple reflection implementation)
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.FIELD)
@interface NotNull {}
class UserVN { @NotNull String name = null; }
public class Q57 {
    public static void main(String[] args) throws Exception {
        UserVN u = new UserVN();
        for(Field f: UserVN.class.getDeclaredFields()){
            if(f.isAnnotationPresent(NotNull.class)){
                f.setAccessible(true);
                if(f.get(u)==null) System.out.println(f.getName() + " is null -> validation failed"); 
            }
        }
    }
}