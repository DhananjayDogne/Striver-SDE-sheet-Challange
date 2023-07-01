import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> arr=new ArrayList<Integer>();
        f(0,num,0,arr);
         Collections.sort(arr);
         return arr;

    }
    static void f(int i,int[] nums,int sum,ArrayList<Integer> arr){
        if(i>=nums.length){
             arr.add(sum);
             return ;
        }
        f(i+1,nums,sum+nums[i],arr);
        f(i+1,nums,sum,arr);

    }

}
