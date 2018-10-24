package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        int count = 0;

        for (int i = 0; i < m.length; i++){
            if (m[i] > 0) count++;
        }

        System.out.println(count);

    }
}
