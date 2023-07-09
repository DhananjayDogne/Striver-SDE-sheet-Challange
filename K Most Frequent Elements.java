import java.util.* ;
import java.io.*; 

class Pair{
	int value;
	int frequency;
	public Pair(int value,int frequency){
           this.value = value;
           this.frequency = frequency;
	}
}
public class Solution {

	public static int[] KMostFrequent(int n, int k, int[] arr) {
		// Write your code here.
		Arrays.sort(arr);
		PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>(){
			public int compare(Pair p1,Pair p2){
				return p2.frequency-p1.frequency;
			}
		});
		for(int i=0;i<n;i++){
			int count=1;
			int ele=arr[i];
           while(i+1<n && arr[i+1]==ele){
                 count++;
				 i++;
		   }
		   
		   pq.add(new Pair(ele,count));
		   
		   if(count>1)i--;
		}
		int[] res=new int[k];
		for(int i=0;i<k;i++){
			if(pq.size()>0){

			res[i]=pq.poll().value;
			}
		}
		Arrays.sort(res);
		return res;
	}

}
