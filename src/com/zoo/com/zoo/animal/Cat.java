package com.zoo.com.zoo.animal;

public class Cat extends Animal{

    Cat(String name)  {
        super(name);
    }

    @Override
    public void say(){
        System.out.println("Meow");
    }

    @Override
    public void getTypeAnimal (){
        System.out.println("I am cat");
    }

    @Override
    public void friengAnimal(Animal animal) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getage() {
        return null;
    }
}
