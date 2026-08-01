import java.util.*;

class C0004 {
    
    public static void main(String arr[]){

        // Number Hashing (Using map)
        int[] nums = {1 , 3 , 2 , 1 , 5 , 6 , 8 , 12 , 3 , 1};

        // Pre-Computation
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }

        // Fetching
        for(int i : map.keySet()){
            System.out.println(i + " is present " + map.get(i) + " times");
        }
    }
}
