import java.util.* ;
import java.io.*; 
public class Solution {

    public static int chessTournament(int[] positions, int n,  int c) 
	{
        // Write your code here. 
        Arrays.sort(positions);
        int low=0;   
        int high=positions[n-1]-positions[0];
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(mid,positions,c)){
                 ans=mid;
                 low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    static boolean isPossible(int space,int[] positions,int c){
        int player=1;
        int lastp=positions[0];
        for(int i=1;i<positions.length;i++){
            if(positions[i]-lastp>=space){
                player++;
                lastp=positions[i];
                if(player==c)return true;
                if(player>c)return false;

            }
        }
        return false;
    }

}
