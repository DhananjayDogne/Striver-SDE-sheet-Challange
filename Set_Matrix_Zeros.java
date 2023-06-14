import java.io.*;
import java.util.* ;

public class Set_Matrix_Zeros {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        // int mat2[][]=new int[matrix.length][matrix[0].length];
        int row0[] =new int[matrix.length];
        int col0[]=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row0[i]=1;
                    col0[j]=1;
                }
               
            }
        }
       
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row0[i]==1 || col0[j]==1){
                    matrix[i][j]=0;
                }
            }
          
        }
         
           
    }
    
}
