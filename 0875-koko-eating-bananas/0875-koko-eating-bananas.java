class Solution {
    public long find(int[] piles,int n,int mid){
         long h = 0;
        for(int i = 0; i<n; i++){
             h = h+piles[i]/mid;
            if(piles[i]%mid!=0){
               h++;
        }
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int fp = 1,rp = 0,res = -1;
        for(int i = 0; i<piles.length; i++){
            rp = Math.max(rp,piles[i]);
        }
        while(fp<=rp){
            int mid = fp+(rp-fp)/2;
            long hour = find(piles,n,mid);
            if(hour>h){
                fp = mid+1;
            }else{
                res = mid;
                rp = mid - 1;
            }
        }
        return res;
    }
}