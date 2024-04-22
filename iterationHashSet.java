/**
 * iterationHashSet
 */
import java.util.*;
public class iterationHashSet {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("delhi");
        set.add("Hyderabad");
        set.add("mumbai");
        set.add("bengaluru");
        set.add("noida");
        // Iterator it = set.iterator();
        // while (it.hasNext()) {
        //     System.err.println(it.next());
        // }
            for(String city: set)
            {
                System.out.println(city);
            }
    }
}