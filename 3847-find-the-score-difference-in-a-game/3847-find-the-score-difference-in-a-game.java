class Solution {
    public int scoreDifference(int[] nums) {
        int num1=0;
        int num2=0;
        boolean ans=true;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]%2==1){
                ans=!ans;
            }
            if(i%6==5){
                ans=!ans;
            }

            if(ans){
                num1+=nums[i];
            }else{
                num2+=nums[i];
            }
        }
        return num1-num2;
    }
}