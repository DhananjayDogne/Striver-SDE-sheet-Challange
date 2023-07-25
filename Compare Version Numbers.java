
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int compareVersions(String a, String b) 
    {
        int i = 0;
        String[] str1 = a.split("\\.");
        String[] str2 = b.split("\\.");
      
        int n = str1.length;
        int m = str2.length;
        while ( i < n && i < m) {
            if (Double.parseDouble(str1[i]) > Double.parseDouble(str2[i])) {
                return 1;
            } else if (Double.parseDouble(str1[i]) < Double.parseDouble(str2[i])) {
                return -1;
            }
            i++;
        }
        if(n==m){
            return 0;
        }

        if(i<n){
            for(i=i;i<n;i++){
                if(!str1[i].equals("0")){
                    return 1;
                }
            }
        }else if(i<m){
             for(i=i;i<m;i++){
                if(!str2[i].equals("0")){
                    return -1;
                }
            }
        }
        return 0;
    }
}
