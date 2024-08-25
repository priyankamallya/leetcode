class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum =0;
        int rsum = 0;
        int l = k-1;
        int r = n-1;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        if(n==k) return lsum;
        int totalSum = lsum;
        while(l>=0){
            lsum = lsum-cardPoints[l];
            l--;
            rsum = rsum + cardPoints[r];
            r--;
            totalSum = Math.max(totalSum,lsum+rsum);
        }
        return totalSum;
    }
}