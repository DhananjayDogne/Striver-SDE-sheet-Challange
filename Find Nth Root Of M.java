
public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int i=1;
        int p=(int)Math.pow(1,n);
        while(p<=(double)m){
             if(p==m){
                 return (int)i;
             }
             if(p>m)break;
             i++;
             p=(int)Math.pow(i,n);
        }
        return -1;
    }
}
