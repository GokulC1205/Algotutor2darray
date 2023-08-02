//5.Count Negative Numbers in a Sorted Matrix
class Solution {
    public int countNegatives(int[][] matrix) {
        int neco=0;
        int col=matrix[0].length;
        int row=matrix.length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]<0)
                neco+=1;
            }
        }
        return neco;
    }
}