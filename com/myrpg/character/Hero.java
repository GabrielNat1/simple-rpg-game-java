package com.myrpg.character;

public class Hero {
    private String name;
    private int hp;

    public Hero(String name) {
        this.name = name;
        this.hp = 100;
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    public void takeDamage(int damage){
        hp -= damage;
        System.out.println(name + " took " + damage + " damage!");
    }

    public void attack() {
        System.out.println(name + " attacks with a sword!");
    }
}
