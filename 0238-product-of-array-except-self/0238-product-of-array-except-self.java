class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int p1=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=p1;
            p1*=nums[i];            
        }
        int p2=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=p2;
            p2*=nums[i];  

        } 
               
        return ans;
    }
}

 // for(int i=0;i<ind;i++){
            //     prod1*=nums[i];
            // }
            // int prod2=1;
            // for(int i=ind+1;i<nums.length;i++){
            //     prod2*=nums[i];
            // }