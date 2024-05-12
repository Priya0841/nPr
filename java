class Solution{
      static long fact(long n) {
       
        if (n == 0 || n == 1)
            return 1;
       
        return n * fact(n - 1);
    }
    static long nPr(long n, long r){
         long ans, N = (long) n, R = (long) r;
        
        ans = fact(N) / fact(N - R);

        return ans;
    }
}
