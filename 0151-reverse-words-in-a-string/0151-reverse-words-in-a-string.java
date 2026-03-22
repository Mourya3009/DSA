class Solution {
    public String reverseWords(String s) {
        String[] res=s.trim().split("\\s+");

        
        String ans="";
        for(int i=res.length-1;i>=0;i--){
            ans+=res[i]+" ";
        }
        return ans.trim();
    }
}