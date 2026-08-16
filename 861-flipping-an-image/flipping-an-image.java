class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int l=0;
            int r=image[0].length-1;
            while(l<=r){
                int temp=image[i][l];
                image[i][l]=image[i][r];
                image[i][r]=temp;
                
                if(l==r){
                    if(image[i][l]==0)image[i][l]=1;
                    else image[i][l]=0;
                    l++;
                    r--;
                }
                else{
                    if(image[i][l]==0)image[i][l]=1;
                    else image[i][l]=0;

                    if(image[i][r]==0)image[i][r]=1;
                    else image[i][r]=0;

                    l++;
                    r--;
                }
                
            }
        }
        return image;
    }
}