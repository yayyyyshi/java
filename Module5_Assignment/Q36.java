// Module 5 Assignment - Question 36
// Maven build lifecycle explanation (print default phases)
public class Q36 {
    public static void main(String[] args) {
        String[] phases = {"validate","compile","test","package","verify","install","deploy"};
        for(String p: phases) System.out.println(p);
    }
}