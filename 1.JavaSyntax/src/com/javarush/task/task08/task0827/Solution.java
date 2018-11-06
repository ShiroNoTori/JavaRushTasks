package com.javarush.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("FEBRUARY 1 2019"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        Date date2 = new Date();

        date2.setTime(-10800000);           //разница в 3 часа по МСК

        date2.setYear(date1.getYear());

        long nOfDays = (date1.getTime() - date2.getTime())/86_400_000;

        return nOfDays%2 != 0;
    }
}
