package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int years = sc.nextInt();
        String name = sc.next();


        System.out.print(name + " захватит мир через " + years + " лет. Му-ха-ха!");
    }
}
