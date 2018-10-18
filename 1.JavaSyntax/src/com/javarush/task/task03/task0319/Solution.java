package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int summ = sc.nextInt();
        int time = sc.nextInt();

        System.out.println(name + " получает " + summ + " через " + time + " лет.");
    }
}
