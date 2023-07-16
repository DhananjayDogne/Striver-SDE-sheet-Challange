import java.util.* ;
import java.io.*; 

public class LFUCache {
	Map<Integer,Integer> map=new HashMap<>();
	int capacity;

	LFUCache(int capacity) {
		// Write your code here.
		map.clear();
		this.capacity=capacity;
	}

	int get(int key) {
		// Write your code here.
		if(map.containsKey(key))return map.get(key);
		return -1;
	}

	void put(int key, int value) {
		// Write your code here.

		if(map.containsKey(key)){
			map.put(key,value);
		}else if(map.size()<capacity){
			map.put(key,value);
		}else{
			int mini=Integer.MAX_VALUE;
			int miniKey=0;
			for(int keys:map.keySet()){
				if(map.get(keys)<mini){
					mini=map.get(keys);
					miniKey=keys;
				}
			}
			map.remove(miniKey);
			map.put(key,value);
		}
	}
}
