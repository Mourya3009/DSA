class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], 1+hm.getOrDefault(nums[i],0));
            if(hm.get(nums[i])>(nums.length/2)){
                return nums[i];
            }
        }
        return nums[0];
    }
}