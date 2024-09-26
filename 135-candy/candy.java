class Solution {
    public int candy(int[] ratings) {
        int i=1;
        int sum=1;
        int n = ratings.length;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                sum+=1;
                i++;
                continue;
            }
            int peak=1;
            //assuming it is a high slope
            while(i<n && ratings[i-1]<ratings[i]){
                peak+=1;
                sum+=peak;
                i++;
            }
            int down =0;
            //assuming it is a downward slope
            while(i<n && ratings[i]<ratings[i-1]){
                down+=1;
                sum+=down;
                i++;
            }
            down++;
            if(down>peak) sum+=(down-peak);
        }
        return sum;
    }
}