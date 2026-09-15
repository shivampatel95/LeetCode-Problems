class Solution {
    public int findNumbers(int[] nums) {
        int i = 0;
        
        int ans = 0;
        while(i<nums.length){
            int count = 0;
            while(nums[i]>0){
                 int digit = nums[i]%10;
             count++;
             nums[i] = nums[i]/10;          
        }
          if(count%2==0){
                ans++;
             }
             i++;
        }
         return ans;
    }
}