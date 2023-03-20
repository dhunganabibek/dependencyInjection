package com.bibekdhungana;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Laptop {

    // private int id;
    // private String name;
    // private String color;

    @Autowired
    @Qualifier("chargerTwo")
    private Charger charger;

    public Laptop() {
    }

    // public Laptop(int id, String name, String color, Charger charger) {
    // this.id = id;
    // this.name = name;
    // this.color = color;
    // this.charger = charger;
    // }

    // public int getId() {
    // return this.id;
    // }

    // public void setId(int id) {
    // this.id = id;
    // }

    // public String getName() {
    // return this.name;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }

    // public String getColor() {
    // return this.color;
    // }

    // public void setColor(String color) {
    // this.color = color;
    // }

    // public Charger getCharger() {
    // return this.charger;
    // }

    // public void setCharger(Charger charger) {
    // this.charger = charger;
    // }

    // @Override
    // public String toString() {
    // return "{" +
    // " id='" + getId() + "'" +
    // ", name='" + getName() + "'" +
    // ", color='" + getColor() + "'" +
    // ", charger='" + getCharger() + "'" +
    // "}";
    // }

}
