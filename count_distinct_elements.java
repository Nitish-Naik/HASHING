import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * count_distinct_elements
 */
public class count_distinct_elements {

    public static void main(String[] args) {
        int num[] = {4,3,2,5,6,7,3,4,2,1};
        // ans = 7;

        HashSet<Integer> distinct = new HashSet<>();
        // Iterator add = 
        for(int a: num)
        {
            distinct.add(a);
        }

        System.out.println(distinct.size());
    }
}