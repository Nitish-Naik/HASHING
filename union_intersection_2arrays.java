import java.util.HashSet;
public class union_intersection_2arrays {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3 ,4, 5};
        int arr2[] = {1, 2, 3,6, 7};

        // set = [7, 3, 9, 6, 2,4]
        // set = [3, 9]

        int c[] = new int[arr1.length + arr2.length];
        for(int i=0; i<arr1.length; i++)
        {
            c[i] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++)
        {
            c[arr1.length+i] = arr2[i];
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<c.length; i++)
        {
            set.add(c[i]);
        }
        System.out.println(set);

        // intersection
        System.out.println(set.size());
        set.clear();
        for(int i:arr1)
        {
            set.add(i);
        }

        int count=0;
        for(int i: arr2)
        {
            if(set.contains(i))
            {
                count++;
                set.remove(i);
            }
        }
        System.out.println(count);
    
    }

}