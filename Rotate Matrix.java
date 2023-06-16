import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
        int up=0,left=0,down=n-1,right=m-1;
        int store2=0;

        while(left<right && up<down){
            int store1=mat.get(up+1).get(left);
            for(int i=left;i<=right;i++){
                store2=mat.get(up).get(i);
                mat.get(up).set(i,store1);
                store1=store2;
            }
            up++;
            
            for(int i=up;i<=down;i++){
                store2=mat.get(i).get(right);
                mat.get(i).set(right,store1);
                store1=store2;
            }
            right--;
            
            for(int i=right;i>=left;i--){
                store2=mat.get(down).get(i);
                mat.get(down).set(i,store1);
                store1=store2;
            }
            down--;
           
            for(int i=down;i>=up;i--){
                store2=mat.get(i).get(left);
                mat.get(i).set(left,store1);
                store1=store2;
            }
            left++;
        }

    }
}
