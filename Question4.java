class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        
        int[] arr = new int[length1 + length2];

        for (int i = 0; i < length1; i++) {
            arr[i] = nums1[i];
        }

        for (int i = 0; i < length2; i++) {
            arr[length1 + i] = nums2[i];
        }

        Arrays.sort(arr);

        if(arr.length%2!=0){
            int middle=(int)Math.floor(arr.length/2);
            return arr[middle];
        }else{
             int middle2=arr.length/2;
             double ans=(arr[middle2]+arr[middle2-1])/2.0;
             return ans;
        }
      
    }
}
