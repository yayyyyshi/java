// Module 5 Assignment - Question 2
// Demonstrate three built-in annotations: @Override, @Deprecated, @SuppressWarnings
public class Q2 {
    @Deprecated
    public static void oldMethod(){ System.out.println("old"); }

    @SuppressWarnings("unused")
    public static void suppressed(){ int x = 0; }

    public static void main(String[] args) {
        // @Override demo
        class Base { void run(){} }
        class Derived extends Base {
            @Override public void run() { System.out.println("Overridden"); }
        }
        new Derived().run();
        oldMethod(); // marked deprecated
        suppressed(); // suppressed warning example
    }
}