class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxAvg = Integer.MIN_VALUE;
        double avg;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j<n){
             sum = sum+nums[j];
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                avg = (double)sum/k;
                maxAvg = Math.max(maxAvg,avg);
                sum = sum-nums[i];
                i++;
                j++;
               
            }
        }
        return maxAvg;
    }
}