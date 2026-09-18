/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int fp = 0;
        int lp = n;
        int ans = -1;
        while(fp<=lp){
            int mid = fp+(lp-fp)/2;
            if(isBadVersion(mid)){
                ans = mid;
                lp = mid-1;
            }else{
                fp=mid+1;
            }
        }
        return ans;
    }
}