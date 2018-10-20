package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int summ = 0;
        String s = Integer.toString(number);
        for(int i = 0; i < s.length(); i++){
            summ += Character.getNumericValue(s.charAt(i));
        }
        return summ;
    }
}