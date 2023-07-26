
public class Solution {
       static class Pair{

        BinaryTreeNode node;

        int index;

        Pair(BinaryTreeNode node, int index){

            this.node = node;

            this.index = index;

        }

    }

 
    public static ArrayList<Integer> bottomView(BinaryTreeNode root) {
         // Write your code here.    
         Map<Integer, Integer> map = new TreeMap<>();

         Queue<Pair> q = new LinkedList<>();

         q.offer(new Pair(root, 0));

 

         while(!q.isEmpty()){

             Pair curr = q.poll();

             BinaryTreeNode node = curr.node;

             int index = curr.index;

 

             map.put(index, node.val);

             if(node.left != null) q.offer(new Pair(node.left, index-1));

             if(node.right != null) q.offer(new Pair(node.right, index+1));

         }

 

         ArrayList<Integer> res = new ArrayList<>();

         for(int e: map.values()){

             res.add(e);

         }

 

         return res;

         
    }
}
