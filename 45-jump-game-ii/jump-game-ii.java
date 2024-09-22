class Solution {
    public int jump(int[] nums) {
        int jumps=0; int l=0; int r=0;
        int n = nums.length;
        while(r<n-1){
            int furthest = 0;
            for(int i=l;i<=r;i++){
                furthest = Math.max(furthest,nums[i]+i);
            }
            l=r+1;
            r = furthest;
            jumps++;
        }
        return jumps;
    }
}