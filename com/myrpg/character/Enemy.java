package com.myrpg.character;

import com.myrpg.character.Hero;

public class Enemy {
    private final String name;
    private int hp;

    public Enemy(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void attack(Hero hero) {
        int damage = (int) (Math.random() * 10) + 1;
        System.out.println(name + " ataca!");
        hero.takeDamage(damage);
    }

    public boolean isDead() {
        return hp <= 0;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
        System.out.println(name + " levou " + damage + " de dano!");
    }

    public void showStatus() {
        System.out.println("Inimigo: " + name + " | HP: " + hp);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}
