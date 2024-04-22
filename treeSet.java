// sorted in ascending order

// null values are not allowed


// in hashset , linkedhashset null are allowed;
import java.util.TreeSet;

/**
 * treeSet
 */
public class treeSet {

    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>();
        cities.add("delhi");
        cities.add("hyderabad");
        cities.add("mumbai");
        cities.add("bengaluru");
        cities.add("noida");

        System.out.println(cities);
    }
}