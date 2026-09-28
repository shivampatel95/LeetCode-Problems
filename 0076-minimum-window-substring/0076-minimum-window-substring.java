class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int i =0,j=0,count=t.length(), minLength = Integer.MAX_VALUE,start = 0;
       Map<Character,Integer>map = new HashMap<>();
       for(int k =0; k<t.length(); k++){
        char ch = t.charAt(k);
        map.put(ch,map.getOrDefault(ch,0)+1);
       } 
       while(j<s.length()){
           char ch = s.charAt(j);
           if(map.containsKey(ch)){
            if(map.get(ch)>0){
                count--;
            }
            map.put(ch,map.get(ch)-1);
           }
            while (count == 0) {

                
                if (j - i + 1 < minLength) {
                    minLength = j - i + 1;
                    start = i;
                }

                char left = s.charAt(i);

                if (map.containsKey(left)) {

                    map.put(left, map.get(left) + 1);

                    
                    if (map.get(left) > 0) {
                        count++;
                    }
                }

                i++;
            }
            j++;
       }
       if (minLength == Integer.MAX_VALUE) {
            return "";
        }
                 return s.substring(start, start + minLength);

    }
}