class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
         int closest = nums[0] + nums[1] + nums[2];
        
        while(i<n-2){
            int left = i+1;
            int right = n-1;           
            while(left<right){
              int sum = nums[i] + nums[left]+ nums[right];
              if(sum == target){
                return sum;
              }
              if(Math.abs(sum - target) < Math.abs(closest - target)) {
                closest = sum;
              }
              if(sum<target){
                left++;
              }else{
                right--;
              }
            }
            i++;
        }
        return closest;
    }
}