import java.util.* ;
import java.io.*; 
class Node{
    Node[] trie=new Node[26];
    boolean end=false;
    int count=0;
    int word=0;
    boolean isPresent(char ch){
        return trie[ch-'a']!=null;
    }
    boolean isEnd(){
        return end;
    }
    Node get(char ch){
        return trie[ch-'a'];
    }
    void add(char ch,Node node){
        trie[ch-'a']=node;
    }
    void erase(char ch){
        trie[ch-'a']=null;
        
    }

}
public class Trie {
    static Node root;
    public Trie() {
        root=new Node();
        // Write your code here.
    }

    public void insert(String word) {
        // Write your code here.
        Node temp=root;
        for(char ch:word.toCharArray()){
            if(!temp.isPresent(ch)){
                temp.add(ch,new Node());
            }
            temp=temp.get(ch);
            temp.word+=1;
        }
        
        temp.end=true;
        temp.count+=1;
    }

    public int countWordsEqualTo(String word) {
        // Write your code here.
        Node temp=root;
        for(char ch:word.toCharArray()){
            if(!temp.isPresent(ch)){
               return 0;
            }
            temp=temp.get(ch);
        }
       
        return temp.count;

    }

    public int countWordsStartingWith(String word) {
        // Write your code here.
        Node temp=root;
       
        for(char ch:word.toCharArray()){
            if(!temp.isPresent(ch)){
                return 0;
            }
            
            temp=temp.get(ch);
        }
        return temp.word;
    }

    public void erase(String word) {
        // Write your code here.
        Node temp=root;
        Node temp2=temp;
        for(char ch:word.toCharArray()){
            if(temp.isPresent(ch)){

            temp=temp.get(ch);
            temp.word-=1;
            }
            
            
        }
        
        temp.count-=1;
        
        if(temp.count==0){

           temp.end=false;
        }
    }

}
