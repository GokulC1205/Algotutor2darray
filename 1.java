//1.Spiral matrix II
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        int row=0,col=0;
        int boun=n-1;
        int sizele=n-1,flag=1;
        char move='r';
        for(int i=1;i<n*n+1;i++){
            ans[row][col]=i;
            switch(move){
                case 'r':
                col+=1;
                break;
                case 'd':
                row+=1;
                break;
                case 'l':
                col-=1;
                break;
                case 'u':
                row-=1;
                break;
            }
            if(i==boun){
                boun=boun+sizele;
                if(flag==2){
                    flag=1;
                    sizele-=1;
                }
                else{
                    flag+=1;
                }
                switch(move){
                    case 'r':
                    move='d';
                    break;
                    case 'd':
                    move='l';
                    break;
                    case 'l':
                    move='u';
                    break;
                    case 'u':
                    move='r';
                }
            }
        }
        return ans;
    }
}
