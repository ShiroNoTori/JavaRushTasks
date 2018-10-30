package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 1; i <= arr.length; i++){

            int min = arr[0];
            int count = 0;

            for (int j = 1; j <= arr.length - i; j++){
                if (arr[j] < min){
                    min = arr[j];
                    count = j;
                }
            }
            System.out.println(min);
            int temp = arr[arr.length - i];
            arr[arr.length - i] = min;
            arr[count] = temp;

        }

    }
}
