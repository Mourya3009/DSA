//         int ind=0;
//         int min=0;
//         int curr=0;
//         for(int i=0;i<nums.length;i++){
//             int temp=ind;
//             int res=i+nums[i];
//             ind=Math.max(ind,res);
//             if(temp!=ind){
//                 min++;
//             }

//             curr=ind;
//             if(curr>=nums.length-1){
//                 return min;
//             }


class Solution {
    public int jump(int[] nums) {
        
        int jumps = 0;
        int currEnd = 0;
        int farthest = 0;

        for(int i = 0; i < nums.length - 1; i++){
            
            farthest = Math.max(farthest, i + nums[i]);
            
            if(i == currEnd){
                jumps++;
                currEnd = farthest;
            }
        }

        return jumps;
    }
}