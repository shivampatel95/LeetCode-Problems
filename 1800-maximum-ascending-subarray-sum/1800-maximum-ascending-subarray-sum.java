class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int sum =nums[0];
        int MaxSum = sum;
        for(int i =1; i<n; i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }else{
                sum = nums[i];
            }
             MaxSum = Math.max(MaxSum,sum);
        }
        return MaxSum;
    }
}