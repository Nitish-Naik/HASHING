// follows order of insertion

import java.util.LinkedHashSet;

/**
 * linkedHashSet
 */
public class linkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("delhi");
        cities.add("Hyderabad");
        cities.add("mumbai");
        cities.add("bengaluru");
        cities.add("noida");

        System.out.println(cities);
        System.out.println(cities.contains("madhapur"));
        System.out.println(cities.remove("delhi"));
    }
}