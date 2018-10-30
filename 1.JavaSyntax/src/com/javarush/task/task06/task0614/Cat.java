package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    private static ArrayList<Cat> cats;


    public Cat() {
        cats.add(this);
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++){
            System.out.println(cats.get(i));
        }
    }
}
