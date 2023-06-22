import java.io.*;
import java.util.* ;

public class Solution {
 
  public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
      Arrays.sort(arr);
      for(int i=0;i<n-3;i++){
           for(int j=i+1;j<n-2;j++){
               int start=j+1;
               int end=n-1;
               int sum=target-arr[i]-arr[j];
               while(start<end){
                 int sum2=arr[start]+arr[end];
                 if(sum==sum2){
                   return "Yes";
                 }else if(sum2<sum){
                   start++;
                 }else{
                   end--;
                 }

               }

           }
      }
      return "No";

  }
  
}
