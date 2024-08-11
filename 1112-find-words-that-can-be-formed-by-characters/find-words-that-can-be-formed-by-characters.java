class Solution {
    public int countCharacters(String[] words, String chars) {
        int count[] = new int[26];
        int sum=0;
        for(char c : chars.toCharArray()){
            count[c-'a']++;
        }
        for(String s : words){
            if(canForm(s,count)){
                sum+=s.length();
            }
        }
        return sum;
    }
    public boolean canForm(String s, int[] count){
        int[] count2 = new int[26];
        for(char c : s.toCharArray()){
            count2[c-'a']++;
            if(count[c-'a']<count2[c-'a']) return false;
        }
        return true;
    }
}