import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target){
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                if(map.get(target-nums[i]) != i){
                    int[] retValue = {i,map.get(target-nums[i])};
                    return retValue;
                }
            }
        }
        
        return null;
    }
}
