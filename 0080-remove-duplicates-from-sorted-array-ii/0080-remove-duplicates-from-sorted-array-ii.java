class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int temp[] = new int[n];
        temp[0] = nums[0];
        int ind=1;
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1] && count>0){
                count--;
                temp[ind]=nums[i];
                ind++;
            }
            if(nums[i]!=nums[i-1]){
                count=1;
                temp[ind]=nums[i];
                ind++;
            }
        }
        for(int i=0;i<ind;i++){
            nums[i] = temp[i];
        }
        return ind;
    }
}