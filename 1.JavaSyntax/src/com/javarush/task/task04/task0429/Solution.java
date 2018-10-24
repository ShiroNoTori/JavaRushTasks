package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] m = new int[3];

        for (int i = 0; i < m.length; i++){
            m[i] = sc.nextInt();
        }

        int positiveN = 0;
        int negativeN = 0;

        for (int i = 0; i < m.length; i++){
            if (m[i] == 0) continue;

            if (m[i] > 0) positiveN++;
            else negativeN++;
        }

        System.out.println("количество отрицательных чисел: " + negativeN + '\n'
                + "количество положительных чисел: " + positiveN);

    }
}
