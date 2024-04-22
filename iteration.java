import java.util.HashMap;
// import java.util.HashSet;
import java.util.Set;
public class iteration 
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> hm = new HashMap<>();    
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        Set<String> keys = hm.keySet();
        for(String i: keys)
        {
            System.out.println(hm.get(i));
        }
        System.out.println(keys);
    }    
}
