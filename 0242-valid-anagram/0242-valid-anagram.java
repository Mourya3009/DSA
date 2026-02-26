class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map=new HashMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            int count=map.getOrDefault(c,0);
            if(count==0) return false;
            map.put(c,count-1);
            if(map.get(c)==0){
                map.remove(c);
            }
            
        }
        return map.isEmpty();
    }
}