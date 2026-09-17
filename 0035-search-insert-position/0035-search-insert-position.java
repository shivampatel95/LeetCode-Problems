class Solution {
    public int searchInsert(int[] nums, int target) {
        int fp = 0;
        int lp = nums.length-1;
            while(fp<=lp){
            int mid = (fp+lp)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                lp = mid-1;
            }else{
                fp = mid + 1;
            }
        }
           
        return fp;
    }
}