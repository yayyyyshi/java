// Module 4 Assignment - Question 2
// Syntax for creating a user-defined generic class with an example.
class PairGeneric<T, U> {
    private T first;
    private U second;
    public PairGeneric(T first, U second) { this.first = first; this.second = second; }
    public T getFirst() { return first; }
    public U getSecond() { return second; }
}
public class Q2 {
    public static void main(String[] args) {
        PairGeneric<String, Integer> p = new PairGeneric<>("Age", 30);
        System.out.println(p.getFirst() + " -> " + p.getSecond());
    }
}