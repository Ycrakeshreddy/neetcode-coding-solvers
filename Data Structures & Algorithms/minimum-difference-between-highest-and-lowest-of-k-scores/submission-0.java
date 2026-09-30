class Solution {
    public int minimumDifference(int[] nums, int k) {

        int min = Integer.MAX_VALUE;

        Arrays.sort(nums);

        int n = nums.length;

        for(int i=0;i<=n-k;i++) {

            int d = nums[i+k-1]-nums[i];

           if(d<min) {
             min = d;
           }

        }

        return min;
        
    }
}