public class Solution {

	public static int zAlgorithm(String s, String p, int n, int m) {
		// Write your code here
        int ans=0;
		
		for(int i=0;i<n;i++){
			if(s.charAt(i)==p.charAt(0)){
                if(i+m<=n && s.substring(i,i+m).equals(p)){
					ans++;
				}
			}
		}
		return ans;
	}

}
