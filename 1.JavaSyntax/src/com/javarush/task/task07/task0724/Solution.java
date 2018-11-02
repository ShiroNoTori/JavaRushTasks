package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {

        Human grandPa1 =  new Human("Belzebub", true, 65);
        Human grandPa2 =  new Human("Asmodeus", true, 65);

        Human grandMa1 =  new Human("Lilith", false, 65);
        Human grandMa2 =  new Human("Zana", false, 65);

        Human father =  new Human("", true, 65, grandPa1, grandMa1);
        Human mother =  new Human("", true, 65, grandPa2, grandMa2);

        Human kid1 =  new Human("", true, 65, father, mother);
        Human kid2 =  new Human("", true, 65, father, mother);
        Human kid3 =  new Human("", true, 65, father, mother);

        System.out.println(grandPa1 + "\n" + grandPa2 + "\n" + grandMa1 + "\n" + grandMa2 + "\n"
                + father + "\n" + mother + "\n" + kid1 + "\n" + kid2 + "\n" + kid3);


    }

    public static class Human {


        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}