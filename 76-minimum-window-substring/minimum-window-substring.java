class Solution {
    public String minWindow(String s, String t) {
        int[] hash = new int[256];
        int n = s.length();
        int m = t.length();
        int l =0;
        int r = 0;
        int sIndex = -1;
        int minLen = Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<m;i++){
            hash[t.charAt(i)]++; //add all the target string characters into the array
        }
        while(r<n){
            char rightChar = s.charAt(r);
            if(hash[rightChar]>0) count++;
            
            hash[rightChar]--; //while encountering a char in string subtract from hash array

            //when we have a valid window try to minimize it
            while(m==count){
                if(r-l+1<minLen){
                    minLen = r-l+1;
                    sIndex = l;
                }
                //contract the window
                char leftChar = s.charAt(l);
                hash[leftChar]++;       //while removing from window add to hash array
                if(hash[leftChar]>0) count--;
                l++;
            }
            r++;
        }
        String res = (sIndex==-1)? "" : s.substring(sIndex,sIndex+minLen); 
        return res;
    }
}