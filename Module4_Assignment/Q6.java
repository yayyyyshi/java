// Module 4 Assignment - Question 6
// Generic Pair<K,V> with getters and setters
public class Q6 {
    static class Pair<K,V> {
        private K key; private V value;
        public Pair(K k, V v){ key=k; value=v; }
        public K getKey(){ return key; }
        public V getValue(){ return value; }
        public void setKey(K k){ key=k; }
        public void setValue(V v){ value=v; }
        public String toString(){ return "("+key+","+value+")"; }
    }
    public static void main(String[] args) {
        Pair<String,Integer> p = new Pair<>("Score", 95);
        System.out.println(p);
        p.setValue(96);
        System.out.println("Updated: " + p.getValue());
    }
}