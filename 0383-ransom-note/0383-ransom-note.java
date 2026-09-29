class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length()-1;
        int m = magazine.length()-1;
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(int i = 0; i<=n; i++){
            char ch = ransomNote.charAt(i);
             map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int j =0; j<=m; j++){
            char ch = magazine.charAt(j);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        for(char ch : map1.keySet()){

            if(map2.getOrDefault(ch, 0) < map1.get(ch)){
                return false;
            }
        }
        
        return true;
    }
}