// Module 5 Assignment - Question 27
// Can a custom annotation extend another? No. Demonstrate by explaining in runtime print.
public class Q27 {
    public static void main(String[] args) {
        System.out.println("Custom annotations cannot extend other annotations; they are interfaces implicitly extending java.lang.annotation.Annotation."); 
    }
}