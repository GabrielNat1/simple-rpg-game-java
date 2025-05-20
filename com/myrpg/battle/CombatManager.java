package com.myrpg.battle;

import com.myrpg.character.Hero;

public class CombatManager {
    public static void startBattle(Hero hero) {
        System.out.println("A wild slime appears!");
        hero.attack();
        hero.takeDamage(10);
        System.out.println(hero.getName() + " has " + hero.getHp() + " HP remaining.");
    }
}
