class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<Integer>();
        int dim=matrix[0].length*matrix.length;
        int fc=0;
        int lc=matrix[0].length-1;
        int fr=0;
        int lr=matrix.length-1;
        int count=0;
        while(fr<=lr && fc<=lc){
            for(int i=fc;i<=lc;i++){
                ans.add(matrix[fr][i]);
                count++;
            }
            if(count>=dim)break;
            fr++;
            for(int i=fr;i<=lr;i++){
                ans.add(matrix[i][lc]);
                count++;
            }
            lc--;
            if(count>=dim)break;

            for(int i=lc;i>=fc;i--){
                ans.add(matrix[lr][i]);
                count++;
            }
            lr--;
            if(count>=dim)break;

            for(int i=lr;i>=fr;i--){
                ans.add(matrix[i][fc]);
                count++;
            }
            fc++;
            if(count>=dim)break;

        }
        return ans;
    }
}