class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum =0;
        int rsum = 0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        int totalSum = lsum;
        if(n==k) return totalSum;
        int right = n-1;
        for(int i=k-1;i>=0;i--){
            lsum = lsum-cardPoints[i];
            rsum = rsum + cardPoints[right];
            right--;
            totalSum = Math.max(totalSum,lsum+rsum);
        }
        return totalSum;
    }
}