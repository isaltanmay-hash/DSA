class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=n*n;
        int sumEven=n*(n+1);

        //using recursion
        return hcf(sumOdd,sumEven);
    }
    public static int hcf(int a,int b){
        if(a==0)return b;
        return hcf(b%a,a);
    }
}