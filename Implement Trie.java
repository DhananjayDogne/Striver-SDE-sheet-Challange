class TrieNode{
    TrieNode(){

    }
     TrieNode[] trie=new TrieNode[26];
    boolean isEnd=false;
    
    boolean isPresent(char ch){
        return trie[ch-'a']!=null;
    }
    TrieNode get(char ch){
       return  trie[ch-'a'];
    }
    void put(char ch,TrieNode node){
        trie[ch-'a']=node;
    }
    boolean isEnd(){
        return isEnd;
    }

};
public class Trie {
     static TrieNode root;
   
    //Initialize your data structure here
   
    Trie() {
        root=new TrieNode();
        //Write your code here
    }
    

    //Inserts a word into the trie

    public static void insert(String word) {
          TrieNode temp=root;
          for(char ch:word.toCharArray()){
              if(! temp.isPresent(ch)){
                  temp.put(ch,new TrieNode());
              }
              temp=temp.get(ch);
          }
          temp.isEnd=true;
        //Write your code here
    }


    //Returns if the word is in the trie

    public static boolean search(String word) {
        //Write your code here
         TrieNode temp=root;
          for(char ch:word.toCharArray()){
              if(! temp.isPresent(ch)){
                  return false;
              }
              temp=temp.get(ch);
          }
         return temp.isEnd;
    }

    
    //Returns if there is any word in the trie that starts with the given prefix

    public static boolean startsWith(String prefix) {
        //Write your code here
         TrieNode temp=root;
          for(char ch:prefix.toCharArray()){
              if(! temp.isPresent(ch)){
                  return false;
              }
              temp=temp.get(ch);
          }
         return true;
    }
}
