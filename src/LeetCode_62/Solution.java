package LeetCode_62;

public class Solution {
    public int uniquePaths(int m, int n) {
        return comb(m+n-2,Math.min(n-1,m-1));
    }

    public int comb(int m,int n){
        if(n==0)
            return 1;
        if (n==1)
            return m;
        if(n>m/2)
            return comb(m,m-n);
        if(n>1)
            return comb(m-1,n-1)+comb(m-1,n);
        return -1;
    }
}
