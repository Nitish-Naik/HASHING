import java.util.HashMap;
import java.util.*;
/**
 * majorityElemapnt
 */
public class majorityElement {

    public static void main(String[] args) {
        // booye more voting algorithm is also used for this..
        int nums[] = {1,3,2,5,1,3,1,5,1};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            // if(!map.containsKey(nums[i]))
            // {
            //     map.put(nums[i], 1);
            // }
            // else
            // {
            //     map.put(nums[i], map.get(nums[i])+1);
            // }

            // OR

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1 );
        }
        int majority = 0;
        for(Integer key: map.keySet())
        {
            if(nums.length/3 < map.get(key)) 
            {
                majority = key;
                System.out.println(majority);
            }
        }
    }
}