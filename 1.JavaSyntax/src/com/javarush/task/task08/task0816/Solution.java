package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {

    public static HashMap<String, Date> createMap() throws ParseException {

        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        HashMap<String, Date> map = new HashMap<String, Date>();

        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Stallon", df.parse("JUNE 1 1980"));
        map.put("Stallo", df.parse("JUNE 1 1980"));
        map.put("Stall", df.parse("JUNE 1 1980"));
        map.put("Stal", df.parse("JUNE 1 1980"));

        map.put("Sta", df.parse("JUNE 1 1980"));
        map.put("St", df.parse("JUNE 1 1980"));
        map.put("S", df.parse("JUNE 1 1980"));
        map.put("S1", df.parse("JUNE 1 1980"));
        map.put("St1", df.parse("JUNE 1 1980"));


        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            HashMap.Entry<String, Date> s = iterator.next();
            if (s.getValue().getMonth() >= 5 && s.getValue().getMonth() <= 7){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args){

    }
}
