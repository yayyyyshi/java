// Module 5 Assignment - Question 3
// Difference between @Override and @Deprecated demonstrated
public class Q3 {
    static class A { void m(){} }
    static class B extends A {
        @Override public void m(){ System.out.println("override works"); }
    }
    @Deprecated
    static class Old { public static void t(){ System.out.println("deprecated"); } }
    public static void main(String[] args) {
        new B().m();
        Old.t();
    }
}