package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.math.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] m = new int[3];

        m[0] = sc.nextInt();
        m[1] = sc.nextInt();
        m[2] = sc.nextInt();

        if (m[0] == m[1] || m[1] == m[2] || m[0] == m[2]){
            if(m[0] == m[1])
                System.out.println(m[0]);
            else System.out.println(m[2]);
            return;
        }

        int max = Math.max(Math.max(m[0], m[1]), m[2]);
        int min = Math.min(Math.min(m[0], m[1]), m[2]);

        for (int i = 0; i < m.length; i++){
            if (m[i] != max && m[i] != min)
                System.out.println(m[i]);
        }
    }
}
