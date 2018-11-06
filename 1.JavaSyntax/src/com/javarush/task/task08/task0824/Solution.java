package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

        Human kid1 = new Human("kid1", true, 69);
        Human kid2 = new Human("kid2", true, 69);
        Human kid3 = new Human("kid3", true, 69);

        ArrayList<Human> listKid1 = new ArrayList<>();
        listKid1.add(kid1);
        listKid1.add(kid2);
        listKid1.add(kid3);

        Human father = new Human("father", true, 69, listKid1);
        Human mother = new Human("mother", false, 69, listKid1);

        ArrayList<Human> listKid2 = new ArrayList<>();
        listKid2.add(father);

        ArrayList<Human> listKid3 = new ArrayList<>();
        listKid3.add(mother);


        Human grandPa1 = new Human("grandPa1", true, 69, listKid2);
        Human grandPa2 = new Human("grandPa2", true, 69, listKid3);

        Human grandMa1 = new Human("grandMa1", false, 69, listKid2);
        Human grandMa2 = new Human("grandMa2", false, 69, listKid3);


        System.out.println(grandPa1.toString());
        System.out.println(grandPa2.toString());
        System.out.println(grandMa1.toString());
        System.out.println(grandMa2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());

    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children){

            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {

            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();

            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
