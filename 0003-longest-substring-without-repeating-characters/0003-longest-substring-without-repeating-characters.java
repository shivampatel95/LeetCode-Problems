class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j<n){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            char ch = s.charAt(j);
            set.add(ch);
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}