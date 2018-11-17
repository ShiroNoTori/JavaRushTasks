package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {

        List<String> listOfWords = new LinkedList<String>();
        List<Integer> listOfNumbers = new LinkedList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                listOfNumbers.add(Integer.parseInt(array[i]));
            } else {
                listOfWords.add(array[i]);
            }
        }

        for (int i = 0; i < listOfWords.size(); i++) {
            String maxStr = listOfWords.get(i);
            int counter = i;

            for (int j = i + 1; j < listOfWords.size(); j++) {

                if (isGreaterThan(maxStr, listOfWords.get(j))) {
                    maxStr = listOfWords.get(j);
                    counter = j;
                }
            }

            String temp = listOfWords.get(i);
            listOfWords.set(i, maxStr);
            listOfWords.set(counter, temp);
        }


        for (int i = 0; i < listOfNumbers.size(); i++) {
            int max = listOfNumbers.get(i);
            int counter = i;

            for (int j = i + 1; j < listOfNumbers.size(); j++) {

                if (listOfNumbers.get(j) > max) {
                    max = listOfNumbers.get(j);
                    counter = j;
                }
            }

            int temp = listOfNumbers.get(i);
            listOfNumbers.set(i, max);
            listOfNumbers.set(counter, temp);
        }

        int iOfWords = 0;
        int iOfNums = 0;

        for (int i = 0; i < array.length; i++) {

            if (isNumber(array[i])) {
                array[i] = listOfNumbers.get(iOfNums).toString();
                iOfNums++;
            } else {
                array[i] = listOfWords.get(iOfWords);
                iOfWords++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
