class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor ==1 ) return dividend;
        if(dividend==divisor) return 1;
        long ans = 0;
        int sign = 1;
        if((dividend>=0 && divisor<0) || (dividend <0 && divisor>=0))
            sign = -1;
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        for(int i=30;i>=0;i--){
            if(n>=(d<<i)){
                ans+=(1<<i);
                n -= (d<<i);
            }
        }
        return (int)(ans*sign);
    }
}
