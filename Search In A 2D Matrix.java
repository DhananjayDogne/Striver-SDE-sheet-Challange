import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int row=mat.size()-1,col=mat.get(0).size()-1;
        while(row>=0){
            if(mat.get(row).get(col)>=target && mat.get(row).get(0)<=target){
                for(int i=0;i<=col;i++){
                    if(mat.get(row).get(i)==target)return true;
                }
                return false;
            }else{
                row--;
            }
        }
        return false;
    }
}
