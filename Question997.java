class Solution {
    public int findJudge(int n, int[][] trust) {
        // Array to keep track of the count of trusts for each person
        int[] trustCounts = new int[n + 1];
        
        // Iterate through the trust array and update the count of trusts for each person
        for (int[] pair : trust) {
            int personA = pair[0];
            int personB = pair[1];
            // Decrease trust count for personA (the one who trusts)
            trustCounts[personA]--;
            // Increase trust count for personB (the one being trusted)
            trustCounts[personB]++;
        }
        
        // Check for the person who is trusted by everyone else in the town
        for (int i = 1; i <= n; i++) {
            if (trustCounts[i] == n - 1) {
                return i; // i is the judge
            }
        }
        
        // If there is no judge, return -1
        return -1;
    }
}
