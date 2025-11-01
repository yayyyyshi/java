// Module 4 Assignment - Question 15
// Comparator vs Comparable demo
import java.util.*;
public class Q15 {
    static class Person implements Comparable<Person> {
        String name; int age;
        Person(String n,int a){name=n;age=a;}
        public int compareTo(Person o){ return this.name.compareTo(o.name); }
        public String toString(){ return name+":"+age; }
    }
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Bob",30), new Person("Alice",25));
        Collections.sort(people); // uses Comparable (name)
        System.out.println("Natural order (name): " + people);
        people.sort(Comparator.comparingInt(p -> p.age)); // custom comparator by age
        System.out.println("By age: " + people);
    }
}