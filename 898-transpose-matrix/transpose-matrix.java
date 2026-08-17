class Solution {
    public int[][] transpose(int[][] matrix) {
        int newRow=matrix[0].length;
        int newColumn=matrix.length;
        int[][] arr=new int[newRow][newColumn];
        for(int i=0;i<newRow;i++){
            for(int j=0;j<newColumn;j++){
                arr[i][j]=matrix[j][i];
            }
        }
        return arr;
    }
}