class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOne=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0;i<mat.length;i++){
            int max=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    max++;
                }
            }
            if(max>maxOne){
                maxOne=max;
                idx=i;
            }
        }
        return new int[]{idx,maxOne};

    }
}