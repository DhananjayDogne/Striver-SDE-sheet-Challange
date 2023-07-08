import java.util.* ;
import java.io.*; 
class Trie{
      Trie[] trie=new Trie[26];
      boolean end=false;

      boolean isPresent(char ch){
              return trie[ch-'a']!=null;
      }
      void add(char ch,Trie t){
        trie[ch-'a']=t;
      }
      Trie get(char ch){
        return trie[ch-'a'];
      }
      boolean isEnd(){
        return end;
      }
}

class Solution {
   
  private static Trie root=new Trie();
 
  public static String completeString(int n, String[] a) {
    // Write your code here.
    root=new Trie();
    for(String s:a){
        insert(s);
    }
    String ans="";
    for(String s:a){
     
              if(prefix(s)){
                if(s.length()>ans.length()){
                  ans=s;
                }else if(s.length()==ans.length() && s.compareTo(ans)<0){
                  ans=s;
                }
                
              }
           
   
      
      
    }
    return ans==""?"None":ans;

  }
  static void insert(String s){
       Trie temp=root;
       for(char ch:s.toCharArray()){
         if(! temp.isPresent(ch)){
           temp.add(ch,new Trie());
         }
         temp=temp.get(ch);
       }
       temp.end=true;
  }
  static boolean prefix(String s){
          Trie temp=root;
          boolean f=true;
       for(char ch:s.toCharArray()){
         if(! temp.isPresent(ch)){
           return false;
         }
         temp=temp.get(ch);
         f=f & temp.isEnd();
       }
       return f;
  }

}
