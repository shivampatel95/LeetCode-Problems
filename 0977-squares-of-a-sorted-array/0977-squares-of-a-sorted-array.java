class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<n; i++){
            nums[i] = nums[i]*nums[i];
        }
        int res[] = new int[n];
        int left = 0;
        int right = n-1;
        int idx =n-1;
        while(left<=right){
           if(nums[left]>=nums[right]){
                res[idx] = nums[left];
                left++;
            }else{
                res[idx] = nums[right];
                right--;
            }
            idx--;
        }
        return res;
    }
}