public class Solution {

	public static boolean isItSudoku(int matrix[][]) {

		// Write your code here.}
		    return dfs(0,0,matrix);
	
		
	}
	static boolean dfs(int row,int col,int matrix[][]){
		if(row==8 && col==9){
               return true;
		}else{
			if(col==9){
				row+=1;
				col=0;
			}
		}
		        if(matrix[row][col]!=0){
					return dfs(row,col+1,matrix);
				}
		
				if(matrix[row][col]==0){
					for(int k=1;k<=9;k++){
						if(isValid(row,col,matrix,k)){
                              matrix[row][col]=k;
							  if(dfs(row,col+1,matrix)){
								  return true;
							  }
							  
						}
						matrix[row][col]=0;
					}
		        }
		return false;

	
	}
	static boolean isValid(int row,int col,int[][] matrix,int k){
            for(int i=0;i<matrix.length;i++){
				if(matrix[row][i]==k){
					return false;
				}
			}
			for(int i=0;i<matrix.length;i++){
				if(matrix[i][col]==k){
					return false;
				}
			}
			int i=(row/3)*3;
			int j=(col/3)*3;
			for(int x=i;x<3+i;x++){
				for(int y=j;y<3+j;y++){
					if(matrix[x][y]==k){
						return false;
					}
				}
			}
			return true;
	}
}
