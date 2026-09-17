class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0,j = 0;
        int sumSub = 0;
        int ans = Integer.MAX_VALUE;
        while(j<nums.length){
            sumSub = sumSub+nums[j];
            while(sumSub>=target){
                ans = Math.min(j-i+1,ans);
                sumSub -= nums[i];
                i++; 
            }


            j++;
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}