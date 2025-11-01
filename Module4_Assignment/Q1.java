// Module 4 Assignment - Question 1
// Demonstrate purpose of generics: type safety & reusability via a generic container.
class Container<T> {
    private T value;
    public Container(T value) { this.value = value; }
    public T get() { return value; }
    public void set(T value) { this.value = value; }
}
public class Q1 {
    public static void main(String[] args) {
        Container<String> cstr = new Container<>("hello");
        System.out.println(cstr.get().toUpperCase());
        Container<Integer> cint = new Container<>(42);
        System.out.println(cint.get() + 8);
    }
}