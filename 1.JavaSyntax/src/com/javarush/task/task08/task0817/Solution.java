package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("1", "qwe");
        map.put("2", "asd");
        map.put("3", "qwe");
        map.put("4", "ass");
        map.put("5", "a");

        map.put("6", "qwe");
        map.put("7", "dfg");
        map.put("8", "dfg");
        map.put("9", "op");
        map.put("0", "as");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<String>(map.values());

        for (int i = 0; i < list.size(); i++){
            String temp = list.get(i);
            int counter = 0;

            for (int j = 0; j < list.size(); j++){
                if (list.get(j).equals(temp))
                    counter++;
            }

            if (counter > 1)
                removeItemFromMapByValue(map, temp);
        }


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {

        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
