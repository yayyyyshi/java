// Module 4 Assignment - Question 33
// Demonstrate importance of equals() and hashCode() in HashSet
import java.util.*;
public class Q33 {
    static class Item {
        int id; String name;
        Item(int id,String name){this.id=id;this.name=name;}
        public boolean equals(Object o){ if(!(o instanceof Item)) return false; Item other=(Item)o; return this.id==other.id; }
        public int hashCode(){ return Integer.hashCode(id); }
        public String toString(){ return id+":"+name; }
    }
    public static void main(String[] args) {
        HashSet<Item> s = new HashSet<>();
        s.add(new Item(1,"A")); s.add(new Item(1,"B"));
        System.out.println(s); // only one because same id (equals & hashCode)
    }
}