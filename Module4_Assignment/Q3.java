// Module 4 Assignment - Question 3
// Bounded type parameter example: accepts only subclasses of Number.
class NumberBox<T extends Number> {
    private T value;
    public NumberBox(T value) { this.value = value; }
    public double doubleValue() { return value.doubleValue(); }
}
public class Q3 {
    public static void main(String[] args) {
        NumberBox<Integer> ib = new NumberBox<>(10);
        NumberBox<Double> db = new NumberBox<>(3.14);
        System.out.println(ib.doubleValue());
        System.out.println(db.doubleValue());
    }
}