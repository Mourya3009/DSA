class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        boolean ans=false;
        int ind=1;
        while(hs.contains(ind)){
            ind++;
        }
        return ind;


        
    }
}