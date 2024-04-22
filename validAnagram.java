/**
 * validAnagram
 */
import java.util.HashMap;
import java.util.Set;
public class validAnagram {

    public static void main(String[] args) {
        String s = "race";
        String t = "care";
        if(s.length() != t.length())
        {
            System.out.println(false);
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<t.length(); i++)
        {
            char ch = t.charAt(i);
            if(map.get(ch) != null)
            {
                if(map.get(ch) == 1)
                {
                    map.remove(ch);
                }
                else
                {
                    map.put(ch, map.get(ch)-1);
                }
            }
            else
            {
                System.out.println(false);
                return;
            }
        }
        System.out.println(map.isEmpty());

    }
}