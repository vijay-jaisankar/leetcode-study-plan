class Solution {
    public int maxProduct(int[] nums) {

        int tempMax = nums[0];
        int negSum = 1, posSum = 1;
        for (int i = 0; i < nums.length; i++) {
            int temp = negSum;
            negSum = Math.min(nums[i] * negSum, nums[i] * posSum);
            negSum = Math.min(negSum, nums[i]);
            
            posSum = Math.max(nums[i] * temp, nums[i] * posSum);
            posSum = Math.max(posSum, nums[i]);
            
            tempMax = Math.max(tempMax, posSum);
        }
        return tempMax;
    }
}