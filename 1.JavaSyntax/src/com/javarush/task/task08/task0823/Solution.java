package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] arr = s.toCharArray();

        arr[0] = Character.toUpperCase(arr[0]);

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == ' ')
                arr[i + 1] = Character.toUpperCase(arr[i + 1]);
        }

        s = String.valueOf(arr);

        System.out.println(s);
    }
}
