package com.javarush.task.task07.task0728;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {



        for (int i = 0; i < array.length; i++){

            int max = array[i];
            int temp;
            int count = i;

            for (int j = i; j < array.length; j++){
                if (array[j] > max){
                    max = array[j];
                    count = j;
                }

            }

            temp = array[i];
            array[i] = array[count];
            array[count] = temp;

        }

    }
}
