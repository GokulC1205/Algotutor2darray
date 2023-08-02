//7.Set Matrix Zeroes
class Solution {
    public void setZeroes(int[][] matrix) {
        int col=matrix[0].length;
        int row=matrix.length;
        int[][] temp=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            temp[i][j]=matrix[i][j];
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<row;k++)
                    temp[k][j]=0;
                    for(int k=0;k<col;k++)
                    temp[i][k]=0;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            matrix[i][j]=temp[i][j];
        }
    }
}