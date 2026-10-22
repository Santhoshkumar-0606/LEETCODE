class Solution {
    public boolean isUgly(int n) {
        //An ugly number is a positive number whose prime factors are only 2, 3, and 5. I repeatedly divide the number by 2, 3, and 5. If the final value becomes 1, it is an ugly number; otherwise it is not.

        if(n<=0) return false;
        while (n%2==0) n/=2;
        while(n%3==0) n/=3;
        while(n%5==0) n/=5;
        return n==1;
    }
}