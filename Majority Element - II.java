import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {        
        int n = arr.size();
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        for(int i : hm.keySet()) {
            if(hm.get(i) > (int) Math.floor(n/3)) {
                res.add(i);
            }
        }
        return res;
    }
       
} 
