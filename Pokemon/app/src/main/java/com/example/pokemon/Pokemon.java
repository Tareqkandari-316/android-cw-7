package com.example.pokemon;

public class Pokemon {

    public String Name;
    public int image;
    public  int attack;
    public  int defence;
    public int total;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Pokemon(String name, int image, int attack, int defence, int total) {
        Name = name;
        this.image = image;
        this.attack = attack;
        this.defence = defence;
        this.total = total;
    }
}
