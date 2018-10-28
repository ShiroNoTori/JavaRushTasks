package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public String color;
    public String address;

    public void initialize(String name){
        this.name = name;
        this.age = 3;
        this.weight = 2;
        this.color = "black";
        this.address = null;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "black";
        this.address = null;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.color = "black";
        this.address = null;
    }

    public void initialize(int weight, String color){
        this.name = null;
        this.age = 3;
        this.weight = weight;
        this.color = color;
        this.address = null;
    }

    public void initialize(int weight, String color, String address){
        this.name = null;
        this.age = 3;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {


    }
}
