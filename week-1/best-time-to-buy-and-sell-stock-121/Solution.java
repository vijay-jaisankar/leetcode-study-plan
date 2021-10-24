class Solution {
    public int maxProfit(int[] prices) {

        int currMin = prices[0];
        int tempMax = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] < currMin){
                currMin = prices[i];
            }
            else{
                if(prices[i]-currMin > tempMax){
                    tempMax = prices[i]-currMin;
                }
            }
        }

        return tempMax;
    }
}