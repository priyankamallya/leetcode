class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] hash = new int[26];
        int count=0;
        for(char c : allowed.toCharArray()){
            hash[c-'a']++;
        }
        for(String str : words){
            boolean flag = true;
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                if(hash[c-'a']==0) flag = false;
            }
            if(flag == true) count++;
        }
        return count;
    }
}