package com.javarush.task.task05.task0532;

import java.io.*;
import java.lang.Math;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int a;
        int maximum = n;

        for (int i = 0; i < n; i++){
            a = Integer.parseInt(reader.readLine());
            if (a > maximum)
                maximum = a;
        }
        
        System.out.println(maximum);
    }
}
