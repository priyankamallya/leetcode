class Solution {
    public int numberOfSubstrings(String s) {
        return func(s,3)-func(s,2);
    }
    public int func(String s, int k){
        int l =0; int r =0; int n = s.length(); 
        int count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<n){
            char c = s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.size()>k){
                char cL = s.charAt(l);
                map.put(cL,map.get(cL)-1);
                if(map.get(cL)==0) map.remove(cL);
                l++;
            }
            count+= r-l+1;
            r++;
        }
        return count;
    }
}