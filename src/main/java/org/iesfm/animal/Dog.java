package org.iesfm.animal;

import java.util.Objects;

public class Dog extends Animal {

    private String race;

    public Dog(int age, String race) {
        super(age);
        this.race = race;
    }

    public void showInfo() {
        System.out.println("Perro");
        System.out.println("Raza : " + getRace());
        System.out.println("Edad : " + getAge());
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(race, dog.race);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), race);
    }
}

