import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        
        int zero=0,two=arr.length-1,i=0;
        while(i<=two){
            if(arr[i]==0){
                swap(arr,i,zero);
                i++;
                zero++;
            }else if(arr[i]==2){
                swap(arr,i,two);
                
                two-=1;
            }else{

            i++;
            }
            
        }
        
      
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
