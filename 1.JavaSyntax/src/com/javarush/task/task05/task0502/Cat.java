package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {

        if (this.age + this.strength + this.weight > anotherCat.age + anotherCat.strength + anotherCat.weight)
            return true;
        else return false;

    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.weight = 1;
        cat1.strength = 1;
        cat1.age = 1;

        Cat cat2= new Cat();
        cat2.weight = 2;
        cat2.strength = 1;
        cat2.age = 1;

        System.out.println(cat2.fight(cat1));
    }
}
