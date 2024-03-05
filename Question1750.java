class Solution {
    public int minimumLength(String s) {
        if(s.length()==1){
            return 1;
        }
        int left=0;
        int right=s.length()-1;
        while(left<right && s.charAt(left)==s.charAt(right)){
            char ch=s.charAt(left);
            //Suffix :-
            while(left<=right && s.charAt(left)==ch){
                left++;
            }
            //Prefix :-
            while(right>=left && s.charAt(right)==ch){
                right--;
            }
        }
        return left>right ? 0 : right-left+1;
    }
}
