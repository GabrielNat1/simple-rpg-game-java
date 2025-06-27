package com.myrpg;

import com.myrpg.character.Hero;
import com.myrpg.battle.CombatManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("👾 Bem-vindo ao MyRpg!");
        Hero hero = new Hero("Soldier", 100);
        CombatManager.startBattle(hero);
    }
}
