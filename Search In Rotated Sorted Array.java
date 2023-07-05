public class Solution {
    public static int search(int arr[], int key) {
        // Write your code here.
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==key){
                return mid;
            }else if((arr[l]<=arr[mid] && arr[mid]>key && arr[l]<=key) || (arr[mid]<=arr[r] && (arr[mid]>key  || arr[r]<key))){
                r=mid-1;
            }else{
                l=mid+1;
            }
                
            
        }
        return -1;
    }
}
