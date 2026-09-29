class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        int major = n/2;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {

                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

        }

        for(int key : map.keySet()){

            int value = key;

            int freq = map.get(key);

            if(freq>major)
            return key;
        }
        
        return -1;
    }
}