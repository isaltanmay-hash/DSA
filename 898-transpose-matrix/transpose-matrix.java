class Solution {
    public int[][] transpose(int[][] matrix) {
        int newRow=matrix[0].length;
        int newColumn=matrix.length;
        int[][] arr=new int[newRow][newColumn];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[j][i]=matrix[i][j];
            }
        }
        return arr;
    }
}