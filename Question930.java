class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmostK(nums, goal) - atmostK(nums, goal-1);
    }
    private int atmostK(int[] nums, int goal) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int ans = 0;

        while(i < nums.length) {
            sum += nums[i];

            while(j<=i && sum > goal) {
                sum -= nums[j];
                j++;
            }
            ans += i-j+1;
            i++;
        }
        return ans;
    }
}
