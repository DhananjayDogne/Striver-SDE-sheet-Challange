import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		// WRITE YOUR CODE HERE
		ArrayList<ArrayList<Integer>> ans =new ArrayList<ArrayList<Integer>>();
		f(0,arr,new ArrayList<Integer>(),ans);
		return ans;

	}
	static void f(int ind,ArrayList<Integer> arr,ArrayList<Integer> l,ArrayList<ArrayList<Integer>> ans){
		if(ind>=arr.size()){
			ans.add(new ArrayList<>(l));
			return;
		}

		
			l.add(arr.get(ind));
			f(ind+1,arr,l,ans);
			l.remove(l.size()-1);
		    f(ind+1,arr,l,ans);
	}

}

