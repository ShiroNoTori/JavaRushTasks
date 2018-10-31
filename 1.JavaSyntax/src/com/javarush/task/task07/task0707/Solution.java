package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            strList.add(Integer.toString(i));
        }
        System.out.println(strList.size());
        for (int i = 0; i < strList.size(); i++){
            System.out.println(strList.get(i));
        }
    }
}
