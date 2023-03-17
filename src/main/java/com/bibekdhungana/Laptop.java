package com.bibekdhungana;

import java.util.Objects;

public class Laptop {

    private int id;
    private String name;
    private String color;
    private Charger laptop;

    public Laptop() {
    }

    public Laptop(int id, String name, String color, Charger laptop) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.laptop = laptop;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Charger getLaptop() {
        return this.laptop;
    }

    public void setLaptop(Charger laptop) {
        this.laptop = laptop;
    }

    public Laptop id(int id) {
        setId(id);
        return this;
    }

    public Laptop name(String name) {
        setName(name);
        return this;
    }

    public Laptop color(String color) {
        setColor(color);
        return this;
    }

    public Laptop laptop(Charger laptop) {
        setLaptop(laptop);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Laptop)) {
            return false;
        }
        Laptop laptop = (Laptop) o;
        return id == laptop.id && Objects.equals(name, laptop.name) && Objects.equals(color, laptop.color)
                && Objects.equals(laptop, laptop.laptop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, laptop);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", color='" + getColor() + "'" +
                ", laptop='" + getLaptop() + "'" +
                "}";
    }

}
