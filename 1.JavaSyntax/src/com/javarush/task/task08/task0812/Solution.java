package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }

        int maxSuccession = 0;
        int currentSuccession = 1;

        for (int i = 1; i < list.size(); i++){

            if (list.get(i).equals(list.get(i - 1))){
                currentSuccession++;
            }   else currentSuccession = 1;

            if (currentSuccession > maxSuccession)
                maxSuccession = currentSuccession;
        }

        System.out.println(maxSuccession);

    }
}