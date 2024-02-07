class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String , List<String>> map=new HashMap<>();
        for(String str : strs){
            char[] temp=str.toCharArray();
            Arrays.sort(temp);
            String res=new String(temp); 
            if (!map.containsKey(res)) {
                map.put(res, new ArrayList<>());
            }
           map.get(res).add(str);  
        }
        for (List<String> list : map.values()){
            ans.add(list);
        }
        return ans;
    }
}
