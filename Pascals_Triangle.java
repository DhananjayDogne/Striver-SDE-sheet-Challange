import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                
				 ArrayList<ArrayList<Long>> ans=new ArrayList<>();
				 for(int i=0;i<n;i++){
					 ArrayList<Long> list =new ArrayList<>();
					 for(int j=0;j<i+1;j++){
                        if(j==0 || j==i){
                           list.add(1L);
						}else{
                           list.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
						}
					 }
					 ans.add(list);
				 }
				 return ans;
	}
}
