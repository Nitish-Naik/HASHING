import java.util.LinkedHashMap;
import java.util.HashMap;
/**
 * linkedHashmap
 */
public class linkedHashmap {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        // doubly linkedlist is used in linkedhashmap
        lhm.put("india", 100);
        lhm.put("usa", 50);
        lhm.put("china", 150);
        // lhm.put("india", 100);
        System.out.println(lhm);

        HashMap<String, Integer> hm = new HashMap<>();
        // single linked list used in hashmap
        hm.put("india", 100);
        hm.put("usa", 50);
        hm.put("china", 150);
        System.out.println(hm);

    }
}