class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen=0;
        int l = 0;
        int r =0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<n){
            char c = s.charAt(r);
            if(map.containsKey(c)){
                int index = map.get(c);
                if(index>=l){
                    l = index+1;
                }
            }
            map.put(c,r);
            maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}