package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> divByThree = new ArrayList<Integer>();
        ArrayList<Integer> divByTwo = new ArrayList<Integer>();
        ArrayList<Integer> remaining = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }


        for (int i = 0; i < list.size(); i++){
            int currentValue = list.get(i);

            if (currentValue%3 == 0 && currentValue%2 == 0){
                divByThree.add(currentValue);
                divByTwo.add(currentValue);
            } else if (currentValue%3 == 0)
                divByThree.add(currentValue);
            else if (currentValue%2 == 0)
                divByTwo.add(currentValue);
            else remaining.add(currentValue);
        }

        printList(divByThree);
        printList(divByTwo);
        printList(remaining);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
