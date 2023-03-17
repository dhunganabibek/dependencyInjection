package com.bibekdhungana;

import java.util.Objects;

public class Charger {

    private int id;
    private String name;
    private String color;

    public Charger() {
    }

    public Charger(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
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

    public Charger id(int id) {
        setId(id);
        return this;
    }

    public Charger name(String name) {
        setName(name);
        return this;
    }

    public Charger color(String color) {
        setColor(color);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Charger)) {
            return false;
        }
        Charger charger = (Charger) o;
        return id == charger.id && Objects.equals(name, charger.name) && Objects.equals(color, charger.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", color='" + getColor() + "'" +
                "}";
    }

}
