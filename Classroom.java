import java.util.HashMap;
public class Classroom
{
    public static void main(String[] args) 
    {
        // Create
        HashMap<String, Integer> hm = new HashMap<>(); 

        // Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // get - O(1)

        int Ind_population = hm.get("India");
        System.out.println(Ind_population);
        System.out.println(hm.get("Indonesia")); // null

        // containsKey - O(1)
        System.out.println(hm.containsKey("US")); //rrue
        System.out.println(hm.containsKey("Japan")); //false

        // remove - O(1)

        // System.out.println(hm.remove("China"));
        System.out.println(hm);
        // size()
        System.out.println(hm.size());

        // isEmpty
        System.out.println(hm.isEmpty());

        // clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}