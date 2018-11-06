package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] array = new String[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }

    }

    public static void sort(String[] array) {


        for (int i = array.length - 1; i >= 0; i--){
            String max = array[i];
            int counter = i;
            String temp;
            for (int j = i; j >= 0; j--){
                if (isGreaterThan(array[j], max)){
                    counter = j;
                    max = array[j];
                }
            }
            temp = array[i];
            array[i] = array[counter];
            array[counter] = temp;
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
