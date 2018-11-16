package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] letters = reader.readLine().toCharArray();
        ArrayList<Character> lostOfVowels = new ArrayList<Character>();
        ArrayList<Character> lostOfConsonants = new ArrayList<Character>();

        for (char c : letters) {
            if (isVowel(c)) {
                lostOfVowels.add(c);
            } else if (!isVowel(c) && c != ' ') {
                lostOfConsonants.add(c);
            }
        }

        for (Character c : lostOfVowels) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (Character c : lostOfConsonants) {
            System.out.print(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}