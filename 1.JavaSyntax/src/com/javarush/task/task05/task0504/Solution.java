package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("belzebub", 2000, 100, 1000);
        Cat cat2 = new Cat("asmodeus", 2500, 500, 1200);
        Cat cat4 = new Cat("lucifer", 10000, 50, 9999);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}