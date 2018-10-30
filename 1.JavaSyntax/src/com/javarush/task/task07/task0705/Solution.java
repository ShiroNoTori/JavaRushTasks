package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] bigArr = new int[20];
        int[] smallArr1 = new int[10];
        int[] smallArr2 = new int[10];

        for (int i = 0; i < bigArr.length; i++){
            bigArr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < smallArr1.length; i++){
            smallArr1[i] = bigArr[i];
        }
        for (int i = 0; i < smallArr2.length; i++){
            smallArr2[i] = bigArr[smallArr2.length + i];
        }
        for (int i = 0; i < smallArr2.length; i++){
            System.out.println(smallArr2[i]);
        }
    }
}
