class Solution {
    public int findMin(int[] nums) {
        int fp =0, rp =nums.length-1,ans = -1;
       while(fp<=rp){
        int mid = (fp+rp)/2;
        if(nums[mid]>nums[nums.length-1]){
            fp = mid+1;
        }else{
            ans = mid;
            rp = mid-1;
        }
       }
       return nums[ans];
    }
}