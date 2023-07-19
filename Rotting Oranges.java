import java.util.*;
public class Solution {
    static class Pair{
          int row;
		  int col;
		  int time;
		  Pair(int row,int col,int time){
			  this.row=row;
			  this.col=col;
              this.time=time;
		  }
	}
	public static int minTimeToRot(int[][] grid, int n, int m) {
		// Write your code here.
		Queue<Pair> q=new LinkedList<>();
		int[][] dp=new int[n][m];
		int count1=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(grid[i][j]==2){
					q.add(new Pair(i,j,0));
					dp[i][j]=2;
				}
				if(grid[i][j]==1){
					count1+=1;
				}
			}
		}
		int ans=0;
		int count=0;
		int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
		while(!q.isEmpty()){
			Pair p=q.poll();
			int r=p.row;
			int c=p.col;
			int t=p.time;
			ans=Math.max(ans,t);
			for(int i=0;i<4;i++){
				if(r+dir[i][0]>=0 && r+dir[i][0]<n && c+dir[i][1]>=0 && c+dir[i][1]<m && grid[r+dir[i][0]][c+dir[i][1]]==1 && dp[r+dir[i][0]][c+dir[i][1]]==0){
					dp[r+dir[i][0]][c+dir[i][1]]=2;
					q.add(new Pair(r+dir[i][0],c+dir[i][1],t+1));
					count+=1;
				}
			}
		}
		if(count!=count1)return -1;
		return ans;
	}
	

}
