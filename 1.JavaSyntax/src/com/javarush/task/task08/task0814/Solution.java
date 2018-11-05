package com.javarush.task.task08.task0814;

import java.util.*;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {

    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < 20; i++){
            set.add(i);
        }

        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {

        ArrayList<Integer> list = new ArrayList<>(set);

        Iterator<Integer> iterator = list.iterator();

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) > 10) {
                list.remove(i);
                i--;
            }
        }

        return new HashSet<Integer>(list);
    }

    public static void main(String[] args) {
    }
}
