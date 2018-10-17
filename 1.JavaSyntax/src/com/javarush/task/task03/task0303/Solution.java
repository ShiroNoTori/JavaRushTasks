package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        convertEurToUsd(10, 1.3);
        convertEurToUsd(100, 1.4);
    }

    public static double convertEurToUsd(int eur, double course) {
        return (eur*course);
    }
}
