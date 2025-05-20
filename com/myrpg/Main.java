package com.myrpg;

import com.myrpg.character.Hero;

public class Main {
    public static void main(String[] args) {
        System.out.println("👾 Welcome To MyRpg!");

        Hero hero = new Hero("Soldier", 100);
        hero.showStatus();
    }
}
