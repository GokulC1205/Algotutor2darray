//8.Kth Smallest Element in a Sorted Matrix
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row=matrix.length;
        int col=matrix[0].length;
        int si=row*col;
        int[] arr=new int[si];
        int pos=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[pos]=matrix[i][j];
                pos+=1;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}