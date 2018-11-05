package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("asd", 1000);
        map.put("qwe", 500);
        map.put("wer", 100);
        map.put("sdf", 10);
        map.put("zxc", 100);

        map.put("xcv", 500);
        map.put("fgh", 100);
        map.put("rty", 1000);
        map.put("vbn", 100);
        map.put("uyi", 1000);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            if (iterator.next().getValue() < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {
    }
}