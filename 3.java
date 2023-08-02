//3.Toeplitz matrix
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length,po=0;
        int[] ans=new int[row+col-1];
        for(int i=0;i<col;i++){
            ans[po]=matrix[0][i];
            po+=1;
        }
        for(int i=1;i<row;i++){
            ans[po]=matrix[i][0];
            po+=1;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i<=j){
                    if(ans[j-i]!=matrix[i][j])
                    return false;
                }
                if(i>j){
                    if(ans[col+i-j-1]!=matrix[i][j]){
                    return false;
                    }
                }
            }
        }
        return true;
    }
}