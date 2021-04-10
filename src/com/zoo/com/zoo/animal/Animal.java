package com.zoo.com.zoo.animal;

public abstract class Animal implements Scratch, Eating {


    Animal(String name) {
        this.name = name;
    }

    protected String name;
    protected String age;

    public abstract void say();


    public abstract void getTypeAnimal();

    public abstract void friengAnimal(Animal animal);

    public abstract int addinational(int a, int b);

    public abstract String addinational(String a, String b);


    public abstract String getName();
    public abstract String getAge();
}
