// Module 5 Assignment - Question 26
// Create @JsonField to specify field names for JSON serialization (demo only)
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.FIELD)
@interface JsonField { String value(); }
class PersonJF { @JsonField("full_name") String name = "Sam"; @JsonField("age") int age = 30; }
public class Q26 {
    public static void main(String[] args) throws Exception {
        PersonJF p = new PersonJF();
        StringBuilder sb = new StringBuilder("{"); 
        Field[] fs = PersonJF.class.getDeclaredFields();
        for(int i=0;i<fs.length;i++){
            Field f = fs[i]; JsonField jf = f.getAnnotation(JsonField.class);
            if(jf!=null){ f.setAccessible(true); sb.append("\""+jf.value()+"\":\""+f.get(p)+"\""); if(i<fs.length-1) sb.append(","); }
        }
        sb.append("}"); System.out.println(sb.toString());
    }
}