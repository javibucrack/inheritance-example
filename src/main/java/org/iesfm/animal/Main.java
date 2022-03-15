package org.iesfm.animal;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(4, "Marron");

        System.out.println(cat.getColour());
        System.out.println(cat.getAge());

        Dog dog = new Dog(5, "San Bernardo");

        System.out.println(dog.getRace());
        System.out.println(dog.getAge());

        List<Cat> cats = new LinkedList<>();
        cats.add(cat);
        for (Cat c : cats) {
            System.out.println(c.getColour());
            System.out.println(c.getAge());
        }

        List<Dog> dogs = new LinkedList<>();
        dogs.add(dog);
        for (Dog d : dogs) {
            System.out.println(d.getRace());
            System.out.println(d.getAge());
        }

        List<Animal> animals = new LinkedList<>();
        animals.add(cat);
        animals.add(dog);
        for (Animal animal : animals) {
            animal.showInfo();
//            if (animal instanceof Cat) {
//                // Ca+sting de tipos, convertimos una variable de tipo Animal
//                //a una variable de tipo Cat
//                Cat c = (Cat) animal;
//                c.showInfo();
//            } else if (animal instanceof Dog) {
//                Dog d = (Dog) animal;
//                d.showInfo();
//            }
        }
    }
}