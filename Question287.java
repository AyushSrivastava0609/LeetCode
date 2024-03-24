class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] visited = new boolean[nums.length+1];
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(visited[nums[i]]) return nums[i];
            visited[nums[i]] = true;
        }
        return -1;
    }
}
