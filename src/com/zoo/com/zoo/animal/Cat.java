package com.zoo.com.zoo.animal;

public class Cat extends Animal{

    private int eat;

    public Cat(String name)  {

        super(name);
        eat = 0;
        System.out.println("Hello i am cat, my name is " + name);
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
        System.out.println(this.name + " is friendly with " + animal.name);

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAge() {
        return age;
    }


    @Override
    public int addinational(int a, int b) {
        return a + b;
    }

    @Override
    public String addinational(String a, String b) {
        return a + b;

    }

    public void scratch(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("scratch");
        }
    }

    public void eating() {
        eat++;
        System.out.println(name + " ate " + eat + " times");
    }




}
