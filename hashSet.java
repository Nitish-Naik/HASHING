import java.util.HashSet;

/**
 * hashSet
 */
public class hashSet {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set);
        System.out.println(set.contains(5));
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());

    }
}