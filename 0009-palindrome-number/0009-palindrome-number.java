class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        if(x<0){
            return false;
        }
        int sum = 0;
        while(x>0){ 
          int d = x%10;
          sum = sum*10+d;
          x = x/10;
        }
        if(sum==temp){
            return true;
        }
        return false;
    }
}