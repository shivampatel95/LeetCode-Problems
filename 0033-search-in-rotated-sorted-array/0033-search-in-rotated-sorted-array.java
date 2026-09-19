class Solution {
    public int search(int[] nums, int target) {
       int fp =0, rp =nums.length-1;
       while(fp<=rp){
        int mid = (fp+rp)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[fp]<=nums[mid]){
            if(target>=nums[fp]&&target<nums[mid]){
                rp = mid-1;
            }else{
                fp = mid+1;
            }
        }else{
            if(target>nums[mid]&&target<=nums[rp]){
                fp = mid+1;
            }else{
                rp = mid-1;
            }
        }
       }
       return -1;
    }
}