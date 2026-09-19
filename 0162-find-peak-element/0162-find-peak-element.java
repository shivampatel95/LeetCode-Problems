class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return 0;
        }

        if (nums[0] > nums[1]) {
            return 0;
        }

        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }
        int lp = 1,rp = nums.length-2;
        while(lp<=rp){
            int mid = (lp+rp)/2;
            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid-1]<nums[mid]){
                lp = mid+1;
            }else{
                rp = mid-1;
            }
        }
        return lp;
    }
}