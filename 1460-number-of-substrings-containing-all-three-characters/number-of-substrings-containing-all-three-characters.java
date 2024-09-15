class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int count=0;int l=0; int r =0;
        int a =-1; int b =-1; int c=-1; //last seen indexes
        while(r<n){
            if(s.charAt(r)=='a') a=r;
            else if(s.charAt(r)=='b') b=r;
            else c=r;
            //finding the left limit of the smallest valid window ending at r
            l = Math.min(a,Math.min(b,c));
            if(l!=-1){
                count+= l+1; //extending window to left
            }
            r++;
        }
        return count;
    }
}