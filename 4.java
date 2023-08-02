//4.Matrix Diagonal sum
class Solution {
    public int diagonalSum(int[][] mat) {
        int le=mat.length;
        int i=0,j=0;
        int su=0;
        while(i<le){
            su+=mat[i][j];
            i++;
            j++;
        }
        i=0;
        j=le-1;
        while(j>=0){
            if(i!=j)
                su+=mat[i][j];
            i++;
            j-=1;
        }
        return su;
        
    }
}