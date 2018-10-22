package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        float t = sc.nextFloat();

        if (t%5 >= 3 && t%5 < 4)
            System.out.println("жёлтый");
        else if (t%5 >= 4 && t%5 < 5)
            System.out.println("красный");
        else System.out.println("зелёный");
    }
}