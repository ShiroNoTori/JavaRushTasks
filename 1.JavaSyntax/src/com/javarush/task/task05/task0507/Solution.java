package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int counter = 0;
        float summ = 0;
        int n;

        while (true){

            n = sc.nextInt();
            if (n == -1){
                System.out.println(summ/counter);
                return;
            } else {
                summ += n;
                counter++;
            }



        }
    }
}

