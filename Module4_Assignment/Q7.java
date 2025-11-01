// Module 4 Assignment - Question 7
// Generic Box<T> with addItem and getItem demo for String and Integer
public class Q7 {
    static class Box<T> {
        private T item;
        public void addItem(T item){ this.item = item; }
        public T getItem(){ return item; }
    }
    public static void main(String[] args) {
        Box<String> sb = new Box<>();
        sb.addItem("hello box");
        System.out.println(sb.getItem());
        Box<Integer> ib = new Box<>();
        ib.addItem(500);
        System.out.println(ib.getItem());
    }
}