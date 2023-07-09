import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(ArrayList<Integer> list:kArrays){
			if(arr.size()==0){
				arr=list;
				continue;
			}
            arr=merge(arr, list);
		}
		return arr;

	}
	private static ArrayList<Integer> merge(ArrayList<Integer> a1,ArrayList<Integer> a2){
                   ArrayList<Integer> arr=new ArrayList<Integer>();
				   int i=0,j=0;
				   while(i<a1.size() && j<a2.size()){
					   if(a1.get(i)< a2.get(j)){
						   arr.add(a1.get(i++));
					   }else{
						   arr.add(a2.get(j++));
					   }
				   }
				   while(i<a1.size()){
					    arr.add(a1.get(i++));
				   }
				    while(j<a2.size()){
					    arr.add(a2.get(j++));
				   }
				   return arr;
	}
}
