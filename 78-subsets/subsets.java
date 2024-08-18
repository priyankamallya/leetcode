class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n= nums.length; 
        int subset = 1<<n; //2^n --> the total number of subsets
        List<List<Integer>> res = new ArrayList<>();
        for(int num = 0; num<subset;num++){
            List<Integer> ls = new ArrayList<>();
            for(int i=0;i<n;i++){
                if((num&(1<<i))!=0){
                    ls.add(nums[i]);
                }
            }
            res.add(ls);
        }
        return res;
    }
}