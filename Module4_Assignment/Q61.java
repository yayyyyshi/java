// Module 4 Assignment - Question 61
// Sort list of custom Student objects using Comparator by marks
import java.util.*;
public class Q61 {
    static class Student { String name; int marks; Student(String n,int m){name=n;marks=m;} public String toString(){return name+":"+marks;} }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("A",70)); students.add(new Student("B",90)); students.add(new Student("C",80));
        students.sort(Comparator.comparingInt(s -> s.marks));
        System.out.println(students);
    }
}