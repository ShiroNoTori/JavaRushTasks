package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static java.lang.String.format;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat format1 = new SimpleDateFormat("MMM dd',' yyyy", Locale.ENGLISH);

        Date date = format.parse(reader.readLine());

        System.out.println(format1.format(date).toUpperCase());
    }
}
