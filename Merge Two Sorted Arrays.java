import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        return merge(arr1,arr2,m,n);
    }
    static int[] merge(int arr1[], int arr2[], int m, int n){
        int ans[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                 ans[k++]=arr1[i++];
                 
            }else{
                 ans[k++]=arr2[j++];
            }
        }
        while(i<m ){
            
            ans[k++]=arr1[i++];
            }
        while(j<n ){
            
            ans[k++]=arr2[j++];
            }
                 
         return ans;
    }
}
