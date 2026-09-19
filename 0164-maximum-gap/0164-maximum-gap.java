class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2){
            return 0;
        }
        int i = 0;
        int j = 0;
        int k = 2;
        int diff = 0;
        int maxDiff = Integer.MIN_VALUE;
        while(j<nums.length){
            if(j-i+1<k){
                j++;
            }if(j-i+1==k){
                 diff = nums[j]-nums[j-1];
                maxDiff = Math.max(diff,maxDiff);
                diff = diff-nums[i];
                i++;
                j++;
            }
        }
        return maxDiff;
    }
}