class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return subarraysWithSumLEToGoal(nums,goal) - subarraysWithSumLEToGoal(nums,goal-1);
    }
    public int subarraysWithSumLEToGoal(int[] nums, int goal) {
        int l=0; int r=0;
        int n = nums.length;
        if(goal<0) return 0;
        int sum=0;
        int count=0;
        while(r<n){
            sum += nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            count+= r-l+1;
            r++;
        }
        return count;
    }

}