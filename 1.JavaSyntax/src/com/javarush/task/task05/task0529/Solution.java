package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int summ = 0;
        String n;
        boolean isOff = false;

        while (!isOff){
            n = sc.nextLine();
            if (n.equals("сумма")){
                isOff = true;
                System.out.println(summ);
            } else {
                summ += Integer.parseInt(n);
            }


        }

    }
}
