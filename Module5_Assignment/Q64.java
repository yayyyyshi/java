// Module 5 Assignment - Question 64
// Practical: Validate string length via custom annotation (full demo combining earlier concepts)
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.FIELD)
@interface MinLen { int value(); }
class Account { @MinLen(5) String pwd = "abc"; }
public class Q64 {
    public static void main(String[] args) throws Exception {
        Account a = new Account();
        for(Field f: Account.class.getDeclaredFields()){
            MinLen ml = f.getAnnotation(MinLen.class);
            if(ml!=null){ f.setAccessible(true); String val = (String)f.get(a); System.out.println(f.getName()+" length="+val.length()+" min="+ml.value()+" valid="+(val.length()>=ml.value())); }
        }
    }
}