package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> map = new HashMap<>();

        boolean isOff = false;

        while (true){
            String address = reader.readLine();
            if (address.isEmpty()) break;
            String name = reader.readLine();
            if (name.isEmpty()) break;
            else map.put(address, name);
        }

        // List of addresses
        /*List<String> addresses = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }*/

        String city = reader.readLine();

        for (Map.Entry<String, String> pair : map.entrySet()){

            if (pair.getKey().equals(city)){
                System.out.println(pair.getValue());
            }
        }

        // Read the house number
        /*int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < addresses.size()) {
            String familyName = addresses.get(houseNumber);
            System.out.println(familyName);
        }*/
    }
}
