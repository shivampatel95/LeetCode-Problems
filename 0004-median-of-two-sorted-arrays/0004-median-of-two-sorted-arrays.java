class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length,m = nums2.length,left =0,right =0,idx = 0;
        int arr[] = new int[n+m];
          while(left<n && right<m){
            if(nums1[left]<nums2[right]){
                arr[idx]=nums1[left];
                left++;
                idx++;
            }else{
                arr[idx]=nums2[right];
                right++;
                idx++;
            }
          }
           while(left<n){
                arr[idx]=nums1[left];
                left++;
                idx++;
            }
             while(right<m){
                arr[idx]=nums2[right];
                right++;
                idx++;
            }
          System.out.print(Arrays.toString(arr));
          if(arr.length%2!=0){
            return (double)arr[arr.length/2];
          }
            return (double)((long)arr[(arr.length/2)]+arr[(arr.length/2)-1])/2;
    }
}