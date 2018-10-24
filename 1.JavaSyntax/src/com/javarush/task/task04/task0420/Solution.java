package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] m = new int[3];
        m[0] += sc.nextInt();
        m[1] += sc.nextInt();
        m[2] += sc.nextInt();


        for (int i = 1; i <= m.length; i++){

            int max = m[m.length - 1];
            int counter = m.length - 1;
            int buffer;


            for (int j = i - 1; j < m.length - 1; j++){
                if (m[j] > max){
                    max = m[j];
                    counter = j;
                }
            }

            System.out.print(max + " ");
            buffer = m[i - 1];
            m[i - 1] = max;
            m[counter] = buffer;

        }




    }
}
