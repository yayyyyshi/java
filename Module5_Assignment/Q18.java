// Module 5 Assignment - Question 18
// Repeatable annotations example
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Tags.class)
@interface Tag { String value(); }
@Retention(RetentionPolicy.RUNTIME) @interface Tags { Tag[] value(); }
@Tag("a") @Tag("b") class Tagged {}
public class Q18 {
    public static void main(String[] args) {
        Tag[] tags = Tagged.class.getAnnotationsByType(Tag.class);
        for(Tag t : tags) System.out.println(t.value());
    }
}