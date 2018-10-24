package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] m = new int[3];

        for (int i = 0; i < m.length; i++)
            m[i] = sc.nextInt();

        if(m[0] == m[1] || m[1] == m[2] || m[0] == m[2]){
            if (m[0] != m[1] && m[0] != m[2])
                System.out.println(1);
            else if (m[1] != m[0] && m[1] != m[2])
                System.out.println(2);
            else if (m[2] != m[0] && m[2] != m[1])
                System.out.println(3);
        }
    }
}
