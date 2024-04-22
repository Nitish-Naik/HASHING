import java.util.TreeMap;
public class treeHashMap {

    public static void main(String[] args) {
        TreeMap<String, Integer> thm = new TreeMap<>();
        thm.put("india", 100);
        thm.put("usa", 50);
        thm.put("china", 150);
        // based on the key elements are sorted
        System.out.println(thm);
    }
}