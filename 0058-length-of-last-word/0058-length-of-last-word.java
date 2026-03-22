class Solution {
    public int lengthOfLastWord(String s) {
        String[] res=s.trim().split("\\s+");
        int ans=res[res.length-1].length();
        return ans;
    }
}