class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen =0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int zeros = 0;
            for(int j=i;j<n;j++){
                if(nums[j]==0){
                    zeros++;
                }
                if(zeros<=k){
                    int len = j-i+1;
                    maxLen = Math.max(len,maxLen);
                }else{
                    break;
                }
            }
        }
        return maxLen;
    }
}