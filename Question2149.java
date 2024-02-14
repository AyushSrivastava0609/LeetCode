class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue <Integer> pos=new LinkedList<>();
        Queue <Integer> neg=new LinkedList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
      ArrayList<Integer> res=new ArrayList<>();
      while(!pos.isEmpty() && !neg.isEmpty()){
            res.add(pos.poll());
            res.add(neg.poll());
      }
      int[] ans=new int[nums.length];
      int j=0;
      for(int r : res){
          ans[j]=r;
          j++;
      }
      return ans;
    }
}
