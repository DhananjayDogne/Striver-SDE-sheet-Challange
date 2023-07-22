import java.util.*;
public class Solution {
	public static String longestCommonPrefix(String[] arr, int n) {
		// Write your code here
		Arrays.sort(arr);
		String f = arr[0];
        String l=arr[n-1];
        String temp = "";
    for(int i=0; i<f.length(); i++) {
            if(f.charAt(i) != l.charAt(i)) return temp;

            temp=temp+f.charAt(i);
         
    }

    return temp;
	}

}
