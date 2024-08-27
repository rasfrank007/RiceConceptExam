package org.example;

import java.util.*;

public class Solution {

    public int getUnpairedElement(int[] listInt){
        int result = 0;
        Map<String, Integer> countMap= new HashMap<>();
        String key;
        for(int i: listInt){
            key = String.valueOf(i);
            if(countMap.containsKey( key)){
                int count = countMap.get(key);
                countMap.put(key, ++count);
            }
            else{
                countMap.put(key , 1);
            }

        }

        for(Map.Entry<String, Integer> entry : countMap.entrySet()){
            if(entry.getValue() == 1){
                result = Integer.parseInt(entry.getKey());
                return result;
            }
        }
        return result;
    }
}
