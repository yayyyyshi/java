// Module 5 Assignment - Question 43
// How to exclude a specific transitive dependency (prints XML snippet)
public class Q43 {
    public static void main(String[] args) {
        String xml = "<exclusions><exclusion><groupId>org.unwanted</groupId><artifactId>bad</artifactId></exclusion></exclusions>";
        System.out.println(xml);
    }
}