class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] retValue = new int[nums.length];

        int leftMul = 1;
        for(int i=0;i<nums.length;i++){          
            if(i != 0){
                leftMul *= nums[i-1];
            }
            retValue[i] = leftMul;
        }

        int rightMul = 1;
        for(int i=nums.length-1;i>=0;i--){
            if(i != nums.length-1){
                rightMul *= nums[i+1];
            }
            retValue[i] *= rightMul;
        }

        return retValue;
    }
}