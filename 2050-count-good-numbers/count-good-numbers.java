class Solution {
    static long MOD=1000000007;
    public int countGoodNumbers(long n) {
        long evenindices=(n+1)/2;
        long oddindices=n/2;
        long res=(power(5,evenindices)*power(4,oddindices)) % MOD;
        return (int)res;

    }
 private static long power(long x,long n){
long ans =1;
    while(n>0){
        if(n%2==1){
        ans=(ans*x)%MOD;
        }
        x=(x*x)%MOD;
        n/=2;
    }
    return ans;
 }
}