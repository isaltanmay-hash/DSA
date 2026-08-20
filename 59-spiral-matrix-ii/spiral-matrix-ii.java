class Solution {
    public int[][] generateMatrix(int n) {
        int fr=0;
        int lr=n-1;
        int fc=0;
        int lc=n-1;

        int arr[][]=new int[n][n];
        int count=0;
        
        while(count<=n*n){
            //right
            for(int i=fc;i<=lc;i++){
                arr[fr][i]=++count;
            }
            fr++;
            if(count==n*n)break;

            //down
            for(int i=fr;i<=lr;i++){
                arr[i][lc]=++count;
            }
            lc--;
            if(count==n*n)break;

            //left
            for(int i=lc;i>=fc;i--){
                arr[lr][i]=++count;
            }
            lr--;
            if(count==n*n)break;

            //up
            for(int i=lr;i>=fr;i--){
                arr[i][fc]=++count;
            }
            fc++;
            if(count==n*n)break;
        }
        return arr;

    }
}