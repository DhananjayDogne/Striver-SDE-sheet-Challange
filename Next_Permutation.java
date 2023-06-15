//Day 2 

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		if(permutation == null || permutation.size() <= 1) {
            return permutation;
        }
		int n=permutation.size();
		int i=n-2;
		while(i>=0 && permutation.get(i)>permutation.get(i+1)){
			i--;
		}
	    
		if(i>=0){
			int j=n-1;
			while(permutation.get(j)<permutation.get(i)){
				j--;
			}
			swap(permutation, i, j);
		}
			n--;
			i++;
			while(i<n){
                 swap(permutation,i++,n--);
			}
		
			return permutation;
	}
	static void swap(ArrayList<Integer> permutation,int i,int j){
          	int temp=permutation.get(i);
			permutation.set(i,permutation.get(j));
			permutation.set(j,temp);
	}
}
