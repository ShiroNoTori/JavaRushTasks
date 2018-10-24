package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int summ = 0;
        boolean stop = false;
        int a = 0;

        while(!stop){
            a = sc.nextInt();
            stop = (a == -1);
            summ += a;
        }
        System.out.println(summ);
    }
}
