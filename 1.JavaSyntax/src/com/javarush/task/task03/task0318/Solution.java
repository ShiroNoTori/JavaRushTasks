package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int years = sc.nextInt();

        System.out.print(name + " захватит мир через " + years + " лет. Му-ха-ха!");
    }
}
