
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

	public static void findMedian(int arr[])  {
        
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		PriorityQueue<Integer> minpq=new PriorityQueue<>();
		PriorityQueue<Integer> maxpq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<arr.length;i++){
			if(maxpq.isEmpty() || maxpq.peek()>=arr[i]){
				maxpq.add(arr[i]);
			}else{
				minpq.add(arr[i]);
			}
			if(maxpq.size()>minpq.size()+1){
               minpq.add(maxpq.poll());
			}else if(maxpq.size()+1<minpq.size()+1){
				maxpq.add(minpq.poll());
			}
			if(maxpq.size()==minpq.size()){

			   System.out.print((maxpq.peek()+minpq.peek())/2+" ");
			}else{
				System.out.print(maxpq.peek()+" ");

			}

		}
    
    }


}
