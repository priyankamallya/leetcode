class Solution {
    public int characterReplacement(String s, int k) {
        //brute force
        int maxLen=0;
        int n = s.length();
        for(int i=0;i<n;i++){
            int[] hash = new int[26];
            int maxfreq = 0;
            for(int j=i;j<n;j++){
                char c = s.charAt(j);
                hash[c-'A']++;
                maxfreq = Math.max(maxfreq,hash[c-'A']);
                int changes = (j-i+1) - maxfreq;
                if(changes<=k){
                    maxLen = Math.max(maxLen,j-i+1);
                }else break;
            }
        }
        return maxLen;
    }
}