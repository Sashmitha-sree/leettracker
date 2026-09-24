class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(image[i][j]==1){
                    image[i][j]=0;
                }
                else{
                    image[i][j]=1;
                }
            }
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=image[i][left];
                image[i][left]=image[i][right];
                image[i][right]=temp;
                left++;
                right--;
            }
        }

        

        return image;
        
        
        
    }
}