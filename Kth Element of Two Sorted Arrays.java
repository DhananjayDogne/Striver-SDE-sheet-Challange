public class Solution {
    public static int ninjaAndLadoos(int nums1[], int nums2[], int m, int n, int kperson) {
        // Write your code here.
         int finalArray[] = new int[n + m];

        int i = 0, j = 0, k = 0;

 

        while (i < m && j < n) {

            if (nums1[i] < nums2[j]) {

                finalArray[k++] = nums1[i++];

            } else {

                finalArray[k++] = nums2[j++];

            }

        }

 

        

            while (i < m){

                finalArray[k++] = nums1[i++];}

        

 

     

            while (j < n){

                finalArray[k++] = nums2[j++];
            }
            return finalArray[kperson-1];
        

 
    }
}
