class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
       HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0,j=0;j<s.length();j++){
           char current=s.charAt(j);
           if(map.containsKey(current)){
              i = Math.max(map.get(current) + 1, i);
            }
             map.put(current, j);
             maxLength = Math.max(maxLength, j - i + 1);
        }
         return maxLength;
    }
}
