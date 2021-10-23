import java.util.HashMap;

class Solution{
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            if(map.containsKey(i) == false){
                map.put(i, 1);
            }
            else{
                return true;
            }
        }

        return false;
    }
}