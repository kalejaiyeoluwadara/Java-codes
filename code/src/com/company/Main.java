package com.company;

class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

}

class Hero extends Person{
    String power;
    Hero(String name, int age,String power){
        super(name,age);
        this.power = power;
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here


    }
}
