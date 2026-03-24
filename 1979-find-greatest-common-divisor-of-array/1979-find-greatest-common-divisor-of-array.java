class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int ans=0;
        for(int i=2;i<=max;i++){
            if(min%i==0 && max%i==0){
                ans=Math.max(ans,i);
            }
        }
        if(ans>1){
            return ans;
        }else{
            return 1;
        }
        
    }
}