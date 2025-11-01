// Module 4 Assignment - Question 63
// LRU cache implemented using LinkedHashMap
import java.util.*;
public class Q63 {
    static class LruCache<K,V> extends LinkedHashMap<K,V> {
        private int capacity;
        public LruCache(int capacity){ super(capacity, 0.75f, true); this.capacity = capacity; }
        protected boolean removeEldestEntry(Map.Entry<K,V> eldest){ return size() > capacity; }
    }
    public static void main(String[] args) {
        LruCache<Integer,String> cache = new LruCache<>(2);
        cache.put(1,"A"); cache.put(2,"B"); cache.get(1); cache.put(3,"C"); // evict least recently used (2)
        System.out.println(cache); // should contain keys 1 & 3
    }
}