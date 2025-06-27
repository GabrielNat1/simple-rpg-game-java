package com.myrpg.battle;

import com.myrpg.character.Hero;
import com.myrpg.character.Enemy;

import java.util.Scanner;

public class CombatManager {
    public static void startBattle(Hero hero) {
        Scanner scanner = new Scanner(System.in);
        Enemy enemy = new Enemy("Slime", 30);
        System.out.println("\n⚔️ Um " + enemy.getName() + " selvagem apareceu!\n");

        while (hero.getHp() > 0 && !enemy.isDead()) {
            System.out.println("====== TURNO ======");
            enemy.showStatus();
            hero.showStatus();

            System.out.println("\nEscolha sua ação:");
            System.out.println("1 - Atacar");
            System.out.println("2 - Fugir");

            String input = scanner.nextLine();

            if (input.equals("1")) {
                int damage = (int) (Math.random() * 10) + 5;
                System.out.println(hero.getName() + " ataca!");
                enemy.takeDamage(damage);
            } else if (input.equals("2")) {
                boolean escaped = Math.random() < 0.5;
                if (escaped) {
                    System.out.println(hero.getName() + " fugiu com sucesso!");
                    return;
                } else {
                    System.out.println("A fuga falhou!");
                }
            } else {
                System.out.println("Comando inválido!");
                continue;
            }

            if (!enemy.isDead()) {
                enemy.attack(hero);
            }
        }

        if (hero.getHp() <= 0) {
            System.out.println(hero.getName() + " foi derrotado...");
        } else {
            System.out.println("Você derrotou o " + enemy.getName() + "!");
        }
    }
}
