class Solution {
    public int findMin(int[] nums) {
         int fp =0, rp =nums.length-1;
       while(fp<=rp){
        int mid = fp+(rp-fp)/2;
        if(nums[mid]>nums[rp]){
          fp = mid + 1;
       }else if(nums[mid]<nums[rp]){
          rp = mid;
       }else{
        rp--;
       }
       }
       return nums[fp];
    }
}