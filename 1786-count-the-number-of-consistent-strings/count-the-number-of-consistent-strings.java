class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] hash = new int[26];
        int count=words.length;
        for(char c : allowed.toCharArray()){
            hash[c-'a']++;
        }
        for(String str : words){
            for(char c: str.toCharArray()){
                if(hash[c-'a']==0){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}