class Solution {
    // public int divide(int dividend, int divisor) {
    //     if(divisor ==1 ) return dividend;
    //     if(dividend==divisor) return 1;
    //     long ans = 0;
    //     long sign = 1;
    //     if(dividend>=0 && divisor<0 || dividend <0 && divisor>=0)
    //         sign = -1;
    //     long n = Math.abs((long)dividend);
    //     long d = Math.abs((long)divisor);
    //     while(n>=d){
    //         int count=0;
    //         while(n>=(d<<(count+1))){
    //             count++;
    //         }
    //         ans+= (1<<count);
    //         n -= (d<<count);
    //     }
    //     return (int)(ans*sign);
    // }
    public int divide(int dividend, int divisor) {
        long c = 0;
        long sign = 1;
        if (divisor == 1) return dividend;
        if ((dividend < 0 && divisor >= 0) || (dividend >= 0 && divisor < 0)) sign = -1;
        long dd = Math.abs((long) dividend);
        long dr = Math.abs((long) divisor);
        for (int i = 30; i >= 0; i--) {
            if (dd >= (dr << i)) {
                c += (1 << i);
                dd -= (dr << i);
            }
        }
        return (int) (c * sign);
    }
}
