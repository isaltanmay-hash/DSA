class Solution {
    int dp[][];

    public int ways(int m, int n, int i, int j) {
        if (i == m || j == n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j]=ways(m, n, i, j + 1) + ways(m, n, i + 1, j);
    }

    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return ways(m, n, 0, 0);
    }
}