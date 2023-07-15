
public class Solution {
    public static List <Integer> getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
     List<Integer> ans= new ArrayList<>();
         f(root,ans);
          return ans;
    }
    static void f(TreeNode  root,List<Integer> ans){
        if(root==null)return ;
        ans.add(root.data);
        if(root.left!=null){
            f(root.left,ans);
        }
        if(root.right!=null){
            f(root.right,ans);
        }
    }
}
