package com.zoo;

import com.zoo.com.zoo.animal.Cat;

public class Main {
    public static void main(String[] args) {

        Cat bars = new Cat("Barsik");
        Cat pushok = new Cat("Pushok");
        bars.friengAnimal(pushok);

        System.out.println(bars.addinational(2, 3));
        System.out.println(bars.addinational("IT", "Scholl"));
        bars.scratch(3);
        bars.eating();
        bars.eating();

    }
}
