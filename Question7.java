class Solution {
    public int reverse(int x) {
       long revnum=0;
        while(x!=0){
   revnum=(revnum*10)+x%10;
            x=x/10;
            }
        if(revnum>Integer.MAX_VALUE || revnum<Integer.MIN_VALUE){
            return 0;
        }
        return(int) revnum;
    }
}
