// Module 4 Assignment - Question 8
// Generic method swapElements swaps two elements in an array
import java.util.Arrays;
public class Q8 {
    public static <T> void swapElements(T[] arr, int i, int j){
        T tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
    }
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4};
        swapElements(a,0,2);
        System.out.println(java.util.Arrays.toString(a));
        String[] s = {"A","B","C"};
        swapElements(s,0,1);
        System.out.println(java.util.Arrays.toString(s));
    }
}