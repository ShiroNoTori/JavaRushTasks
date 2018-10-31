package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            strings.add(reader.readLine());
        }

        int min = strings.get(0).length();
        int max = 0;
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < strings.size(); i++){
            int currentSize = strings.get(i).length();
            if (currentSize > max){
                max = currentSize;
                indexMax = i;
            }
            if (currentSize < min){
                min = currentSize;
                indexMin = i;
            }
        }

        if (indexMax < indexMin)
            System.out.println(strings.get(indexMax));
        else System.out.println(strings.get(indexMin));

    }
}
