package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int year = sc.nextInt();
        int month = sc.nextInt();
        int date = sc.nextInt();

        System.out.println("Меня зовут " + name + "." + "\n" +
                "Я родился " + date + "." + month + "." + year);
    }
}
