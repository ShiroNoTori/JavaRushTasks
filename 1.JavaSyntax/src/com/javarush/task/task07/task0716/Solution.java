package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();

        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++){

            String currentStr = list.get(i);

            boolean hasP = false;
            boolean hasL = false;

            for (int j = 0; j < currentStr.length(); j++){
                if (currentStr.charAt(j) == 'л') {
                    hasL = true;
                }
                if (currentStr.charAt(j) == 'р') {
                    hasP = true;
                }
            }

            if (hasL && !hasP){
                list.add(i+1, currentStr);
                i++;
            }
            else if (hasP && !hasL){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}