package org.iesfm.animal;

import java.util.Objects;

public class Cat extends Animal {

    private String colour;

    public Cat(int age, String colour) {
        super(age);
        this.colour = colour;
    }

    public void showInfo() {
        System.out.println("Gato");
        System.out.println("Color : " + getColour());
        System.out.println("Edad : " + getAge());
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(colour, cat.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colour);
    }
}
