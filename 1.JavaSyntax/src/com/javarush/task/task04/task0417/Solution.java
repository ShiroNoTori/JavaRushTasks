package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String s1 = "";

        if (a == b || a == c)
            s1 += a + " ";
        if (b == a || b == c)
            s1 += b + " ";
        if (c == a || c == b)
            s1 += c + " ";
        if (a !=b && b != c && a != c)
            return;
        System.out.println(s1);
    }
}