package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x != 0 && y != 0){
            if (x > 0 && y > 0)
                System.out.println(1);
            else if (x < 0 && y > 0)
                System.out.println(2);
            else if (x < 0 && y < 0)
                System.out.println(3);
            else if (x > 0 && y < 0)
                System.out.println(4);
        }
    }
}
