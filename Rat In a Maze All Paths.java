import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        // Write your code here.
        int[][] visit=new int[n][n];
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        f(0,0,maze,visit,n,arr);
        return arr;

    }
    static void f(int row,int col,int[][] maze,int[][] visit, int n,ArrayList<ArrayList<Integer>> arr){
        if(row==n-1 && col==n-1){
            ArrayList<Integer> l=new ArrayList<>();
            visit[n-1][n-1]=1;
            for(int i=0;i<visit.length;i++){
                for(int j=0;j<visit[0].length;j++){
                     l.add(visit[i][j]);
                }
            }
            visit[n-1][n-1]=0;
            arr.add(new ArrayList<>(l));
            return ;
        }

        if(row<0 || col<0 || row>=n || col>=n || maze[row][col]==0 || visit[row][col]==1)return ;

        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<4;i++){
            visit[row][col]=1;
            f(row+dir[i][0],col+dir[i][1],maze,visit,n,arr);
            visit[row][col]=0;
        }

    }
}
