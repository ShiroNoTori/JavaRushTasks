package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a >= 1 && a <= 999){
            if (a%2 == 0)
                System.out.print("четное ");
            else System.out.print("нечетное ");

            switch (count(a)){
                case 1:
                    System.out.print("однозначное число");
                    break;
                case 2:
                    System.out.print("двузначное число");
                    break;
                case 3:
                    System.out.print("трехзначное число");
                    break;
            }

        }


    }

    public static int count (int a){

        int counter = 1;
        while (true){
            if (a/10 >= 1) {
                a /= 10;
                counter++;
            }
            else break;
        }
        return counter;
    }
}
